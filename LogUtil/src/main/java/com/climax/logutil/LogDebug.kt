package com.climax.logutil

import android.util.Log

/**
 * Created by nickhuang on 3/16/21.
 */
class LogDebug {
    companion object {
        @JvmStatic
        val TAG = "SUPER_AWESOME_APP"

        @JvmStatic
        fun d(message: String) {
            Log.d(TAG, message)
        }
    }
}