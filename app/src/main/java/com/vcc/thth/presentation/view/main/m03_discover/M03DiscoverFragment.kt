package com.vcc.thth.presentation.view.main.m03_discover

import androidx.fragment.app.viewModels
import com.vcc.thth.R
import com.vcc.thth.base.BaseFragment
import com.vcc.thth.databinding.M03FragmentDiscoverBinding
import com.vcc.thth.presentation.widget.viewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class M03DiscoverFragment : BaseFragment(R.layout.m03_fragment_discover) {
    private val viewModel: M03DiscoverViewModel by viewModels()
    private val binding by viewBinding(M03FragmentDiscoverBinding::bind)

    override fun initView() {

    }

    override fun initObserver() {

    }

    override fun getData() {

    }

}