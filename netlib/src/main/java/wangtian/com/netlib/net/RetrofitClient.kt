package wangtian.com.netlib.net

import okhttp3.ConnectionPool
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by apple on 2018/11/20.
 */
object RetrofitClient {

    private val DEFAULT_CONNECT_TIMEOUT = 50L
    private val DEFAUTL_WRITE_TIMEOUT = 50L
    private val DEFAULT_READ_TIMEOUT = 50L

    private fun getOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)) //日志,所有的请求响应度看到
                .connectTimeout(DEFAULT_CONNECT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(DEFAULT_READ_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(DEFAUTL_WRITE_TIMEOUT, TimeUnit.SECONDS)
                .connectionPool(ConnectionPool(8, 15L, TimeUnit.SECONDS))
                .build()
    }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
                .baseUrl(Const.NET_BASE_DOMIN)
                .client(getOkHttpClient())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }


    fun <T : Any> createService(service: Class<T>): T {
        return getRetrofit().create(service)
    }

}