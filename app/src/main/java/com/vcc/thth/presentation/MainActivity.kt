package com.vcc.thth.presentation

import android.os.Bundle
import com.vcc.thth.R
import com.vcc.thth.base.BaseActivity
import com.vcc.thth.databinding.M00ActivityMainBinding
import com.vcc.thth.helper.DialogSnackBarUtils
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    lateinit var binding: M00ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = M00ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initDestinationChange()
        DialogSnackBarUtils.init(this)
    }

    private fun initDestinationChange() {
        getController().addOnDestinationChangedListener { controller, destination, arguments ->
//            Timber.e("Destination Change : ${destination.label}")
            when (destination.id) {
                R.id.m00_main_fragment -> {
                }
            }
        }
    }

}