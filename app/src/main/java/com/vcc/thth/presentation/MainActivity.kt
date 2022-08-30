package com.vcc.thth.presentation

import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.navigation.NavDestination
import com.vcc.thth.R
import com.vcc.thth.base.BaseActivity
import com.vcc.thth.databinding.M00ActivityMainBinding
import com.vcc.thth.helper.DialogSnackBar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    lateinit var binding: M00ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = M00ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initDestinationChange()
        DialogSnackBar.init(this)
    }

    private fun initDestinationChange() {
        getController().addOnDestinationChangedListener { controller, destination, arguments ->
//            Timber.e("Destination Change : ${destination.label}")
            changeStatusBarColor(destination)
            when (destination.id) {
                R.id.m00_main_fragment -> {
                }
            }
        }
    }

    private fun changeStatusBarColor(navDestination: NavDestination) {
        val listColorLight = listOf(R.color.color_white, R.color.color_red)
        val color = getColorFromDestination(navDestination)
        try {
            WindowInsetsControllerCompat(window, window.decorView).apply {
                isAppearanceLightStatusBars = listColorLight.contains(color)
            }
            window.statusBarColor = ContextCompat.getColor(this, color)
        } catch (e: Exception) {
            e.stackTrace
        }
    }

    private fun getColorFromDestination(navDestination: NavDestination) =
        when (navDestination.id) {
            R.id.m06_demo_fragment -> R.color.black
            else -> R.color.color_white
        }

}