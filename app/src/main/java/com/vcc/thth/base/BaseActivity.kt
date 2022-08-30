package com.vcc.thth.base

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.ConnectivityManager
import android.net.Network
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.vcc.thth.R
import com.vcc.thth.helper.DialogSnackBar
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber
import javax.inject.Inject

@AndroidEntryPoint
abstract class BaseActivity : AppCompatActivity() {
    companion object {
        const val TIME = 5000L

    }

    var isBack = false
    var backHandler = Handler(Looper.myLooper()!!)

    @Inject
    protected lateinit var sharePreference: SharedPreferences
    override fun onBackPressed() {
        Timber.e("onBackPressed")
        if (getController().previousBackStackEntry == null) {
            if (!isBack) {
                Toast.makeText(this, "Click 1 lần nữa để thoát app", Toast.LENGTH_LONG).show()
                isBack = true
                backHandler.postDelayed({
                    isBack = false
                }, TIME)
            } else {
                super.onBackPressed()
            }
        } else {
            getController().popBackStack()
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            connectivityManager.registerDefaultNetworkCallback(object :
                ConnectivityManager.NetworkCallback() {
                override fun onAvailable(network: Network) {

                }

                override fun onLost(network: Network) {
                    DialogSnackBar.showDisconnectSnackBar()
                }
            })
        }
    }

    protected fun getController() = findNavController(R.id.nav_host_fragment_content_main)
    override fun onDestroy() {
        super.onDestroy()
        backHandler.removeCallbacksAndMessages(null)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        getController().handleDeepLink(intent)
    }

}