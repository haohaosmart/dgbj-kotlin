package com.baishijiaju.dgbjForKotlin.util

import android.text.TextUtils
import android.util.Log
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by apple on 2019/1/4.
 */
object DataFormatUtil {
    private var sf: SimpleDateFormat? = null
    private val TAG = "DateFormat"

    //时间戳转换成字符串
    fun getDateToString(time: Long): String {
        var s = ""
        if (time.toDouble() != 0.0) {
            val d = Date(time)
            sf = SimpleDateFormat("yyyy.MM.dd")
            s = sf!!.format(d)
        }
        return s

    }

    fun getDateToString(date: Date): String {
        sf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        return sf!!.format(date)
    }

    fun getDateToStringDay(time: Long): String {
        if (time.toDouble() == 0.0) {
            return ""
        } else {
            val d = Date(time)
            sf = SimpleDateFormat("yyyy-MM-dd")
            return sf!!.format(d)
        }
    }

    fun getDateStringToLong(dateString: String?): Long? {
        Log.d(TAG, "dateString is " + dateString!!)
        if (TextUtils.isEmpty(dateString) || dateString == null)
            return System.currentTimeMillis()

        sf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        var date = Date()
        try {
            date = sf!!.parse(dateString)
        } catch (e: ParseException) {
            e.printStackTrace()
        }

        return date.time
    }


    //说明：此方法的存在是因为之前写的代码导致在本地存储的时间相关不规范  有的存储下来的是时间戳 有的是存储下来的字符串
    //判断当前字符串位数  如果是13位  说明之前存储的是时间戳
    fun getDate(dateString: String): Date? {
        /*  Date date = null;
        sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
        date = sf.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;   */
        var date: Date? = null
        if (dateString.length == 13) {
            date = Date(java.lang.Long.valueOf(dateString)!!)
        } else {
            sf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            try {
                date = sf!!.parse(dateString)
            } catch (e: ParseException) {
                e.printStackTrace()
            }

        }
        return date
    }


    fun secToTime(time: Int): String {
        var timeStr: String? = null
        var hour = 0
        var minute = 0
        var second = 0
        if (time <= 0)
            return "00:00"
        else {
            minute = time / 60
            if (minute < 60) {
                second = time % 60
                timeStr = unitFormat(minute) + ":" + unitFormat(second)
            } else {
                hour = minute / 60
                if (hour > 99)
                    return "99:59:59"
                minute = minute % 60
                second = time - hour * 3600 - minute * 60
                timeStr = unitFormat(hour) + ":" + unitFormat(minute) + ":" + unitFormat(second)
            }
        }
        return timeStr
    }

    fun unitFormat(i: Int): String {
        var retStr: String? = null
        if (i >= 0 && i < 10)
            retStr = "0" + Integer.toString(i)
        else
            retStr = "" + i
        return retStr
    }
}