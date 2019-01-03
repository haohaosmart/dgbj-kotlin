package wangtian.com.netlib.baseUI

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import android.widget.Toast


/**
 * Created by apple on 2018/11/21.
 */
abstract class BaseFragment : Fragment(){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    fun showToast(msg: String) {
        Toast.makeText(activity,msg, Toast.LENGTH_LONG).show()
    }
}