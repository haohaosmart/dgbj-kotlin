package com.baishijiaju.dgbjForKotlin.util

import java.util.regex.Pattern
import java.util.regex.PatternSyntaxException

/**
 * Created by apple on 2019/1/4.
 */
object PhoneUtil {
    @Throws(PatternSyntaxException::class)
    fun isPhoneLegal(str: String): Boolean {
        val regExp = "^((13[0-9])|(14[5,7])|(15[0-3,5-9 ])|(166)|(17[3,5,6,7,8])" + "|(18[0-9])|(19[8,9]))\\d{8}$"
        val p = Pattern.compile(regExp)
        val m = p.matcher(str)
        return m.matches()
    }
}