package com.baishijiaju.dgbjForKotlin.util

import io.reactivex.Observable
import io.reactivex.ObservableEmitter
import io.reactivex.ObservableOnSubscribe
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.Callable

/**
 * Created by apple on 2019/1/4.
 */
object CalculationUtil {
    fun <T> makeObservable(func: Callable<T>): Observable<T> {
        return Observable.create(
                ObservableOnSubscribe<T> { emitter -> emitter.onNext(func.call()) }).subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
    }
}