package com.vcc.thth.helper

import android.annotation.SuppressLint
import android.os.Handler
import com.google.android.material.snackbar.Snackbar
import com.vcc.thth.presentation.MainActivity


@SuppressLint("StaticFieldLeak")
object DialogSnackBar {
    private var activity: MainActivity? = null
    private var isShowSnackBar = false
    fun init(activity: MainActivity) {
        this.activity = activity
    }

    fun showDisconnectSnackBar() {
        try {
            if (!isShowSnackBar) {
                isShowSnackBar = true
                activity?.binding?.root?.let {
                    Snackbar.make(
                        it,
                        "Không có kết nối mạng",
                        Snackbar.LENGTH_SHORT
                    ).show()
                }
                Handler().postDelayed({
                    isShowSnackBar = false
                }, 1000)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}