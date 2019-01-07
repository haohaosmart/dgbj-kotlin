package com.baishijiaju.dgbjForKotlin.ui.login

import android.app.Activity
import android.content.Intent
import android.util.Log
import com.baishijiaju.dgbjForKotlin.util.GsonUtil
import wangtian.com.netlib.baseUI.BasePresenter
import wangtian.com.netlib.entity.UserLoginRequest
import wangtian.com.netlib.entity.UserLoginResponse
import wangtian.com.netlib.entity.api.UserApiService
import wangtian.com.netlib.net.BaseObserver
import wangtian.com.netlib.net.ExceptionHandle
import wangtian.com.netlib.net.RetrofitClient

/**
 * Created by apple on 2018/11/16.
 */
class LoginPresenter(iLoginView: ILoginView) : BasePresenter<ILoginView>() {

    var userApiService: UserApiService

    init {
        attachView(iLoginView)
        userApiService = mRetrofitClient.createAPIService(UserApiService::class.java)
    }


    fun onLogin(username: String, password: String, phoneCode: String) {
        addSubscription(userApiService.reqLogin(UserLoginRequest(username,password,phoneCode)), object : BaseObserver<UserLoginResponse>() {

            override fun onFinish() {

            }

            override fun onError(e: ExceptionHandle.ResponeThrowable) {

            }

            override fun onSuccess(model: UserLoginResponse) {
               mView?.onLoginSucceed(model)
            }

        })


    }
}