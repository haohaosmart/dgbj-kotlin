package wangtian.com.netlib.baseUI

import android.content.Context
import android.content.DialogInterface
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.os.Environment
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import wangtian.com.netlib.net.Const
import java.io.File


/**
 * Created by apple on 2018/11/15.
 */
abstract class BaseActivity : AppCompatActivity() {
    var mActivity: AppCompatActivity? = null
    var mCompositeDisposable: CompositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivity = this
        super.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
    }

    fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }

    fun showBackAlertDialog(msg: String) {
        AlertDialog.Builder(this)
                .setTitle("提示").setMessage(msg)
                .setPositiveButton("是", DialogInterface.OnClickListener { dialogInterface, i ->
                    finish()
                })
                .setNegativeButton("否", null)
                .show()
    }

    fun dismissKeyboard(view : View){
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0) //强制隐藏键盘
    }

    fun getAppFileFolderPath(): String {
        val documentsFile = Environment.getExternalStorageDirectory().absoluteFile
        if (!documentsFile.exists()) {
            documentsFile.mkdirs()
        }
        return documentsFile.absolutePath + File.separator + Const.APP_NAME + File.separator
    }

    fun addSubscription(disposable: Disposable) {
        mCompositeDisposable.add(disposable)
    }

}