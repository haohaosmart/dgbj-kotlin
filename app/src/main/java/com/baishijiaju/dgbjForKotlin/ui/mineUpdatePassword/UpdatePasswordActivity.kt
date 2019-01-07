package com.baishijiaju.dgbjForKotlin.ui.mineUpdatePassword

import android.text.TextUtils
import android.view.View
import com.baishijiaju.dgbjForKotlin.R
import com.baishijiaju.dgbjForKotlin.util.PhoneUtil
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Action
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_estate_main.*
import kotlinx.android.synthetic.main.activity_update_password.*
import wangtian.com.netlib.MvpActivity
import wangtian.com.netlib.entity.UserSendCodeResponse
import wangtian.com.netlib.entity.UserUpdatePasswordResponse
import java.util.concurrent.TimeUnit
import java.util.function.Consumer

/**
 * Created by apple on 2019/1/4.
 */
class UpdatePasswordActivity : MvpActivity<UpdatePasswordPresenter>(),IUpdatePasswordView, View.OnClickListener{


    override fun createPresenter(): UpdatePasswordPresenter {
        return UpdatePasswordPresenter(this)
    }

    override fun getActivityViewId(): Int {
        return R.layout.activity_update_password
    }

    override fun init() {
        tvSendCode.setOnClickListener(this)
        llRight.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
       when(view?.id){
           R.id.tvSendCode -> onSendCode()
           R.id.llRight -> onUpdatePassword()
       }
    }

    fun onSendCode(){
        val phone = etPhone.text.toString().trim()
        if (TextUtils.isEmpty(phone)){
            showToast("请输入手机号")
            return
        }
        if(!PhoneUtil.isPhoneLegal(phone)){
            showToast("请输入正确的手机号码")
            return
        }
        mPresenter?.reqSendCode(phone)
    }

    fun onUpdatePassword(){
        val phone = etPhone.text.toString().trim()
        val code = etCode.text.toString().trim()
        val newPassword = etNewPassword.text.toString().trim()
        val confirmPassword = etConfirmPassword.text.toString().trim()
        if (TextUtils.isEmpty(phone)) {
            showToast("请输入手机号")
            return
        }
        if (TextUtils.isEmpty(code)) {
            showToast("请输入验证码")
            return
        }
        if (TextUtils.isEmpty(newPassword)) {
            showToast("请输入新密码")
            return
        }
        if (TextUtils.isEmpty(confirmPassword)) {
            showToast("请输入确认密码")
            return
        }
        if (newPassword != confirmPassword) {
            showToast("新密码和确认密码需要保持一致")
            return
        }
        if (!PhoneUtil.isPhoneLegal(phone)) {
            showToast("请输入正确的手机号码")
            return
        }

        mPresenter?.reqUpdatePassword(phone, code, newPassword, confirmPassword)
    }

    fun startCount(){
        val sum: Long = 60
        addSubscription(Observable.interval(1, TimeUnit.SECONDS)
                .take(61, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe { tvSendCode.isClickable = false }
                .doOnNext { aLong ->
                    val btnText = (sum - aLong!!).toString() + "秒"
                    tvSendCode.text = btnText
                }
                .doOnComplete {
                    tvSendCode.isClickable = true
                    val btnText = "获取验证码"
                    tvSendCode.text = btnText
                }
                .subscribe())
    }

    override fun showMsg(msg: String) {
    }

    override fun onGetCodeResult(userSendCodeResponse: UserSendCodeResponse) {
        if (userSendCodeResponse.code=="0"){
            showToast("验证码已发送到您的手机，请查收")
            startCount()
        } else {
            showToast(userSendCodeResponse.msg)
        }
    }

    override fun onUpdatePasswordResult(userUpdatePasswordResponse: UserUpdatePasswordResponse) {
        if (userUpdatePasswordResponse.code == "0"){
            showToast("密码修改成功")
            finish()
        } else {
            showToast(userUpdatePasswordResponse.msg)
        }
    }

}