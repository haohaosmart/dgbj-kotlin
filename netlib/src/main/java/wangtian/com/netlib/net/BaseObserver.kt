package wangtian.com.netlib.net

import io.reactivex.observers.DisposableObserver

/**
 * Created by apple on 2018/11/20.
 */
abstract class BaseObserver<M> : DisposableObserver<M>() {
    abstract fun onSuccess(model: M)
    abstract fun onError(e: ExceptionHandle.ResponeThrowable)
    abstract fun onFinish()


    override fun onComplete() {
        onFinish()
    }

    override fun onNext(model: M) {
        onSuccess(model)
    }

    override fun onError(e: Throwable) {
        e.printStackTrace()
        if (e is ExceptionHandle.ResponeThrowable) {
            onError(e)
        } else {
            onError(ExceptionHandle.ResponeThrowable(e, ExceptionHandle.ERROR.UNKNOWN))
        }
    }
}