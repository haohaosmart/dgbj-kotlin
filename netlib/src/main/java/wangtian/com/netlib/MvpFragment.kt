package wangtian.com.netlib

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import wangtian.com.netlib.baseUI.BaseFragment
import wangtian.com.netlib.baseUI.BasePresenter
import wangtian.com.netlib.baseUI.BaseView

/**
 * Created by apple on 2018/11/21.
 */
abstract class MvpFragment<P : BasePresenter<out BaseView>>: BaseFragment() {
    var mPresneter: P ?= null
    protected var isViewInitiated: Boolean = false
    protected var isVisibleToUser: Boolean = false
    protected var isDataInitiated: Boolean = false

    abstract fun createPresenter(): P

    abstract fun getFragmentViewId(): Int

    abstract fun init()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(getFragmentViewId(),null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mPresneter = createPresenter()
        isViewInitiated = true
        init()
        prepareFetchData()
    }

    fun prepareFetchData(): Boolean {
        return prepareFetchData(false)
    }

    fun prepareFetchData(forceUpdate: Boolean): Boolean {
        if (isVisibleToUser && isViewInitiated && (!isDataInitiated || forceUpdate)) {
            fetchData()
            return true
        }
        return false
    }

    abstract fun fetchData()

    override fun onDestroyView() {
        super.onDestroyView()
        mPresneter?.detachView()
    }
}