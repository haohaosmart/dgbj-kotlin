package com.baishijiaju.dgbjForKotlin.ui.login

import android.text.InputType
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_login.*
import wangtian.com.netlib.MvpActivity
import com.baishijiaju.dgbjForKotlin.R

/**
 * Created by apple on 2018/11/19.
 */
class LoginActivity : MvpActivity<LoginPresenter>(), ILoginView, View.OnClickListener {

    private val TAG = "Login"
/*    private val ivPasswordDisplyToggle: ImageView by lazy {
       findViewById<ImageView>(R.id.ivPasswordDisplyToggle)
    }
    private val etAccount: EditText by lazy {
        findViewById<EditText>(R.id.etAccount)
    }
    private val etPassword:EditText by lazy {
        findViewById<EditText>(R.id.etPassword)
    }*/

    override fun getActivityViewId(): Int {
        return R.layout.activity_login
    }

    override fun init() {
        btLogin.setOnClickListener(this)
        ivPasswordDisplyToggle.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btLogin -> onLogin()
            R.id.ivPasswordDisplyToggle -> togglePasswordShow()
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
        mPresenter?.onLogin(account, password, "123123")
    }

    override fun createPresenter(): LoginPresenter {
        return LoginPresenter(this)
    }

    override fun showMsg(msg: String) {
        showToast("登录成功")
    }

    override fun onLoginSucceed() {
        Log.d(TAG, "---登录成功----")
    }
}