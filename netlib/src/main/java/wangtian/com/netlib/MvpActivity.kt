package wangtian.com.netlib

import android.os.Bundle
import com.jaeger.library.StatusBarUtil
import wangtian.com.netlib.baseUI.BaseActivity
import wangtian.com.netlib.baseUI.BasePresenter
import wangtian.com.netlib.baseUI.BaseView

/**
 * Created by apple on 2018/11/16.
 */
abstract class MvpActivity<P : BasePresenter<out BaseView>>: BaseActivity() {
    var mPresenter: P ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getActivityViewId())
        mPresenter = createPresenter()
        StatusBarUtil.setTranslucentForImageViewInFragment(mActivity,0,null)
        StatusBarUtil.setLightMode(this)
        init()
    }

    abstract fun createPresenter(): P

    abstract fun getActivityViewId(): Int

    abstract fun init()

    override fun onDestroy() {
        super.onDestroy()
        mPresenter?.detachView()
    }

}