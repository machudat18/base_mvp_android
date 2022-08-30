package com.vcc.thth.presentation.view.main.m01_home

import android.content.Intent
import androidx.fragment.app.viewModels
import com.vcc.thth.R
import com.vcc.thth.base.BaseFragment
import com.vcc.thth.databinding.M01FragmentHomeBinding
import com.vcc.thth.presentation.view.main.M00MainFragmentDirections
import com.vcc.thth.presentation.widget.viewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class M01HomeFragment : BaseFragment(R.layout.m01_fragment_home) {

    private val viewModel: M01HomeViewModel by viewModels()
    private val binding by viewBinding(M01FragmentHomeBinding::bind)
    override fun initView() {
        getData()
        binding.root.setOnClickListener {
            navigate(M00MainFragmentDirections.actionM00MainFragmentToM06DemoFragment(null))

        }
    }

    override fun initObserver() {

    }

    override fun getData() {
        viewModel.getData()

    }

}