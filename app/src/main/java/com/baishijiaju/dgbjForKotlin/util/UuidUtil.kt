package com.baishijiaju.dgbjForKotlin.util

import java.util.*

/**
 * Created by apple on 2019/1/4.
 */
object UuidUtil {
    fun creatUUID(): String {
        val uuid = UUID.randomUUID()
        return uuid.toString().replace("-", "").toUpperCase()
    }
}