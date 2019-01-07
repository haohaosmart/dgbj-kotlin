package com.baishijiaju.dgbjForKotlin.ui.login

import android.Manifest
import android.content.Intent
import android.text.InputType
import android.text.TextUtils
import android.util.Log
import android.view.View
import com.baishijiaju.dgbjForKotlin.MainApplication
import kotlinx.android.synthetic.main.activity_login.*
import wangtian.com.netlib.MvpActivity
import com.baishijiaju.dgbjForKotlin.R
import com.baishijiaju.dgbjForKotlin.ui.mineUpdatePassword.UpdatePasswordActivity
import com.mylhyl.acp.Acp
import com.mylhyl.acp.AcpListener
import com.mylhyl.acp.AcpOptions
import wangtian.com.netlib.entity.UserLoginResponse
import wangtian.com.netlib.net.Const
import wangtian.com.netlib.util.SharedPreferencesUtil
import java.io.File

/**
 * Created by apple on 2018/11/19.
 */
class LoginActivity : MvpActivity<LoginPresenter>(), ILoginView, View.OnClickListener {

    private val TAG = "Login"

    override fun getActivityViewId(): Int {
        return R.layout.activity_login
    }

    override fun init() {
        btLogin.setOnClickListener(this)
        ivPasswordDisplyToggle.setOnClickListener(this)
        ivBanner.setOnClickListener(this)

        initPermissions()
    }

    fun initPermissions() {
        Acp.getInstance(this).request(AcpOptions.Builder()
                .setPermissions(Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.CAMERA,
                        Manifest.permission.ACCESS_FINE_LOCATION,
                        Manifest.permission.ACCESS_COARSE_LOCATION)
                .build(),
                object : AcpListener {
                    override fun onGranted() {
                        val appFoler = File(getAppFileFolderPath())
                        if (!appFoler.exists()) {
                            appFoler.mkdir()
                        }
                    }

                    override fun onDenied(permissions: List<String>) {
                        Log.d(TAG, permissions.toString() + "权限拒绝")
                    }
                })
    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btLogin -> onLogin()
            R.id.ivPasswordDisplyToggle -> togglePasswordShow()
            R.id.ivBanner -> startActivity(Intent(this, UpdatePasswordActivity::class.java))
        }
    }

    private fun togglePasswordShow() {
        if (etPassword.inputType != InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD) {
            etPassword.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            ivPasswordDisplyToggle.setImageResource(R.mipmap.icon_look)
        } else {
            etPassword.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            ivPasswordDisplyToggle.setImageResource(R.mipmap.icon_nolook)
        }
        val content = etPassword.text.toString()
        etPassword.setSelection(content.length)
    }

    private fun onLogin() {
        val account = etAccount.text.toString().trim()
        val password = etPassword.text.toString().trim()
        if (TextUtils.isEmpty(account)) {
            showToast("请输入用户名")
        }
        if (TextUtils.isEmpty(password)) {
            showToast("请输入密码")
        }
        Log.d(TAG, "---deviceId---" + MainApplication.instance.mDeviceId)
        val phoneCode = MainApplication.instance.mDeviceId ?: ""
        mPresenter?.onLogin(account, password, phoneCode)
    }

    override fun createPresenter(): LoginPresenter {
        return LoginPresenter(this)
    }

    override fun showMsg(msg: String) {
        showToast(msg)
    }

    override fun onLoginSucceed(userLoginResponse: UserLoginResponse) {
        if (userLoginResponse.code == "0") {
            SharedPreferencesUtil.setPrefString(applicationContext, Const.SP_TOKEN, userLoginResponse.data.token)
        } else {
            showToast("登录失败：" + userLoginResponse.msg)
        }
    }
}