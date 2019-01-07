package com.baishijiaju.dgbjForKotlin.ui.mineUpdatePassword

import wangtian.com.netlib.baseUI.BaseView
import wangtian.com.netlib.entity.UserLoginResponse
import wangtian.com.netlib.entity.UserSendCodeResponse
import wangtian.com.netlib.entity.UserUpdatePasswordResponse

/**
 * Created by apple on 2019/1/4.
 */
interface IUpdatePasswordView :BaseView{
    fun onGetCodeResult(userSendCodeResponse: UserSendCodeResponse)
    fun onUpdatePasswordResult(userUpdatePasswordResponse: UserUpdatePasswordResponse)
}