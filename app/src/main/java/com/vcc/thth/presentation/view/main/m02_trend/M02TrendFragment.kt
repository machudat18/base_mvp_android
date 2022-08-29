package com.vcc.thth.presentation.view.main.m02_trend

import androidx.fragment.app.viewModels
import com.vcc.thth.R
import com.vcc.thth.base.BaseFragment
import com.vcc.thth.databinding.M02FragmentTrendBinding
import com.vcc.thth.presentation.widget.viewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class M02TrendFragment : BaseFragment(R.layout.m02_fragment_trend){
    private val viewModel: M02TrendViewModel by viewModels()
    private val binding by viewBinding(M02FragmentTrendBinding::bind)
    override fun initView() {

    }

    override fun initObserver() {

    }

    override fun getData() {

    }
}