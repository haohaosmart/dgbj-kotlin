package wangtian.com.netlib.net

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import okhttp3.ResponseBody
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

/**
 * Created by apple on 2019/1/3.
 */
class TokenIntercepter(token: String, tokenExpiredListener: TokenExpiredListener) : Interceptor {

    private val TAG = "TokenInt"

    var mToken: String
    var mTokenExpiredListener: TokenExpiredListener

    init {
        mToken = token
        mTokenExpiredListener = tokenExpiredListener
    }

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val request: Request
        val requestBuilder = original.newBuilder()
                .header("x-access-token", mToken)
        request = requestBuilder.build()

        val response = chain.proceed(request)
        val mediaType = response.body()?.contentType()
        val resultStr = response.body()?.string()
        if (resultStr != null) {
            if (isTokenExpired(resultStr)) {
                mTokenExpiredListener.onTokenExpired()
            }
        }

        //如果token正常返回结果
        return response.newBuilder().body(ResponseBody.create(mediaType, resultStr)).build()
    }


    /**
     * 根据Response，判断Token是否失效
     *
     * @param str
     * @return
     */
    private fun isTokenExpired(str: String): Boolean {
        try {
            val jsonObject = JSONObject(str)
            val code = jsonObject.optString("code")
            if (code == "2000") {
                return true
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        return false
    }
}