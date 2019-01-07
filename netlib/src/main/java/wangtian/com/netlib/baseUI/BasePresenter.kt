package wangtian.com.netlib.baseUI

import android.app.Activity
import android.content.Intent
import android.content.SharedPreferences
import android.support.v4.app.Fragment
import android.util.Log
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import wangtian.com.netlib.net.Const
import wangtian.com.netlib.net.RetrofitClient
import wangtian.com.netlib.net.TokenExpiredListener
import wangtian.com.netlib.util.SharedPreferencesUtil

/**
 * Created by apple on 2018/11/15.
 */
abstract class BasePresenter<V : Any> {

    var mView: V? = null
    lateinit var mActivity: Activity
    lateinit var mRetrofitClient:RetrofitClient

    var mCompositeDisposable: CompositeDisposable = CompositeDisposable()

    fun attachView(view: V) {
        mView = view

        if (mView is Activity) {
            mActivity = mView as Activity
        } else if (mView is Fragment) {
            val fragment: Fragment = mView as Fragment
            mActivity = fragment.activity as Activity
        }

        val context = mActivity.applicationContext
        val token = SharedPreferencesUtil.getPrefString(context, Const.SP_TOKEN,"")
        mRetrofitClient = RetrofitClient.getRetrofit(token,object : TokenExpiredListener {
            override fun onTokenExpired() {
                try {
                    val clz = Class.forName("com.baishijiaju.dgbjforkotlin.ui.collectMain.CollectMainActivity")
                    mActivity.startActivity(Intent(mActivity, clz))
                } catch (e: ClassNotFoundException) {
                    e.printStackTrace()
                    Log.d("error", e.toString())
                }

            }
        })
    }

    fun detachView() {
        mView = null
        mCompositeDisposable.dispose()
    }

    fun addSubscription(disposable: Disposable) {
        mCompositeDisposable.add(disposable)
    }

    fun <T> addSubscription(observable: Observable<T>, observer: DisposableObserver<T>) {
        mCompositeDisposable.add(observer)
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(observer)
    }
}