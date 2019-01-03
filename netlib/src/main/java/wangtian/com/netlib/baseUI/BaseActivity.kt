package wangtian.com.netlib.baseUI

import android.content.Context
import android.content.DialogInterface
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast


/**
 * Created by apple on 2018/11/15.
 */
abstract class BaseActivity : AppCompatActivity() {
    var mActivity: AppCompatActivity? = null

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


}