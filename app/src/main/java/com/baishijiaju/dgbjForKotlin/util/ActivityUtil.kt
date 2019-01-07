package com.baishijiaju.dgbjForKotlin.util

import android.app.Activity
import android.app.ActivityManager
import android.content.Context.ACTIVITY_SERVICE

/**
 * Created by apple on 2019/1/4.
 */
object ActivityUtil {
    fun isTopActivity(activity: Activity): Boolean {
        val am = activity.getSystemService(ACTIVITY_SERVICE) as ActivityManager
        val cn = am.getRunningTasks(1)[0].topActivity
        return cn.className.contains(activity.javaClass.name)
    }
}