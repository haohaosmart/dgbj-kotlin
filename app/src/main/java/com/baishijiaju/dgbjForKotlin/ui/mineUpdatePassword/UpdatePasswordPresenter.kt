package com.baishijiaju.dgbjForKotlin.ui.mineUpdatePassword


import wangtian.com.netlib.baseUI.BasePresenter
import wangtian.com.netlib.entity.*
import wangtian.com.netlib.entity.api.UserApiService
import wangtian.com.netlib.net.BaseObserver
import wangtian.com.netlib.net.ExceptionHandle
import wangtian.com.netlib.net.RetrofitClient

/**
 * Created by apple on 2019/1/4.
 */
class UpdatePasswordPresenter(iUpdatePasswordView: IUpdatePasswordView) :BasePresenter<IUpdatePasswordView>() {
    var userApiService:UserApiService

    init {
        attachView(iUpdatePasswordView)
        userApiService = mRetrofitClient.createAPIService(UserApiService::class.java)
    }

    fun reqSendCode(phone:String){
       addSubscription(userApiService.reqSendCode(UserSendCodeRequest(phone)),object :BaseObserver<UserSendCodeResponse>(){
           override fun onFinish() {

           }

           override fun onError(e: ExceptionHandle.ResponeThrowable) {

           }

           override fun onSuccess(model: UserSendCodeResponse) {
               mView?.onGetCodeResult(model)
           }

       })

    }

    fun reqUpdatePassword(phone:String,code:String,newPassword:String,confirmPassword:String){
        addSubscription(userApiService.reqUpdatePassword(UserUpdatePasswordRequest(phone,code,newPassword,confirmPassword)),
                object :BaseObserver<UserUpdatePasswordResponse>(){
                    override fun onSuccess(model: UserUpdatePasswordResponse) {
                       mView?.onUpdatePasswordResult(model)
                    }

                    override fun onError(e: ExceptionHandle.ResponeThrowable) {

                    }

                    override fun onFinish() {

                    }

                })
    }
}