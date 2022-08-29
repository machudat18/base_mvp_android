package com.vcc.thth.presentation.view.main.m05_user

import com.vcc.thth.R
import com.vcc.thth.base.BaseFragment
import com.vcc.thth.databinding.M05FragmentUserBinding
import com.vcc.thth.presentation.widget.viewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class M05UserFragment() : BaseFragment(R.layout.m05_fragment_user) {

    private val binding by viewBinding(M05FragmentUserBinding::bind)

    override fun initView() {}
    override fun initObserver() {}

    override fun getData() {}
}