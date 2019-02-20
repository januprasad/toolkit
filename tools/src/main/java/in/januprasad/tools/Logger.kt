package `in`.januprasad.tools

import android.util.Log

/**
 * Created by januprasad on 20,February,2019
 */
object Logger {
    private const val TAG = "Logger"
    fun e(msg: String) = Log.e(TAG, msg)
    fun v(msg: String) = Log.v(TAG, msg)
    fun i(msg: String) = Log.i(TAG, msg)
    fun d(msg: String) = Log.d(TAG, msg)
}