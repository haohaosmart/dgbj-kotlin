package com.baishijiaju.dgbjForKotlin

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.graphics.Color
import android.os.Build
import android.util.Log
import com.alibaba.sdk.android.push.CommonCallback
import com.alibaba.sdk.android.push.noonesdk.PushServiceFactory
import com.squareup.leakcanary.LeakCanary

/**
 * Created by apple on 2019/1/4.
 */
class MainApplication : Application() {

    private val TAG = "MainApp"
    var mDeviceId:String ?= null

    companion object {
        lateinit var instance: MainApplication
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        initCloudChannel(this)
        if (LeakCanary.isInAnalyzerProcess(this)) {//1
            return
        }
        LeakCanary.install(this)
    }

    /**
     * 初始化云推送通道
     *
     * @param applicationContext
     */
    private fun initCloudChannel(applicationContext: Context) {
        this.createNotificationChannel()
        PushServiceFactory.init(applicationContext)
        val pushService = PushServiceFactory.getCloudPushService()
        pushService.register(applicationContext,object : CommonCallback{
            override fun onSuccess(response: String?) {
                Log.d(TAG, "init cloudchannel success response: " + response)
                Log.d(TAG, "--deviceId---" + pushService.getDeviceId())
                mDeviceId = pushService.getDeviceId()
            }

            override fun onFailed(p0: String?, p1: String?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }




    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val mNotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            // 通知渠道的id
            val id = "dgbjPushAndroidNotice"
            // 用户可以看到的通知渠道的名字.
            val name = "notification channel"
            // 用户可以看到的通知渠道的描述
            val description = "notification description"
            val importance = NotificationManager.IMPORTANCE_HIGH
            val mChannel = NotificationChannel(id, name, importance)
            // 配置通知渠道的属性
            mChannel.description = description
            // 设置通知出现时的闪灯（如果 android 设备支持的话）
            mChannel.enableLights(true)
            mChannel.lightColor = Color.RED
            // 设置通知出现时的震动（如果 android 设备支持的话）
            mChannel.enableVibration(true)
            mChannel.vibrationPattern = longArrayOf(100, 200, 300, 400, 500, 400, 300, 200, 400)
            //最后在notificationmanager中创建该通知渠道
            mNotificationManager.createNotificationChannel(mChannel)
        }
    }
}