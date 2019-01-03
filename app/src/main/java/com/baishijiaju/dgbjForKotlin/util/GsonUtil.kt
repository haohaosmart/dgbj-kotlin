package com.baishijiaju.dgbjForKotlin.util

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/**
 * Created by apple on 2019/1/3.
 */
object GsonUtil {

     fun toJsonString(`object`: Any): String {
        val gson = Gson()
        return gson.toJson(`object`)
    }

     fun <T> fromJson(json: String, type: Class<T>): T {
        val gson = Gson()
        return gson.fromJson(json, type)

    }

     fun <T> listFromJson(json: String): List<T>? {
        val gson = Gson()
        return gson.fromJson<List<T>>(json, object : TypeToken<List<T>>() {

        }.type)
    }
}