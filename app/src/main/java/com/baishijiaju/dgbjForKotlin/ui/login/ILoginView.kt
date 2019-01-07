package com.baishijiaju.dgbjForKotlin.ui.login

import wangtian.com.netlib.baseUI.BaseView
import wangtian.com.netlib.entity.UserLoginResponse


/**
 * Created by apple on 2018/11/16.
 */
interface ILoginView: BaseView {
    fun onLoginSucceed(userLoginResponse: UserLoginResponse)
}