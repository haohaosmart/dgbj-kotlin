package wangtian.com.netlib.baseUI

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers

/**
 * Created by apple on 2018/11/15.
 */
abstract class BasePresenter<V : Any> {

    var mView: V? = null

    var mCompositeDisposable: CompositeDisposable = CompositeDisposable()

    fun attachView(view: V) {
        mView = view
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