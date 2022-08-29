package com.vcc.thth.presentation.view.main.m04_notification

import androidx.fragment.app.viewModels
import com.vcc.thth.R
import com.vcc.thth.base.BaseFragment
import com.vcc.thth.databinding.M03FragmentDiscoverBinding
import com.vcc.thth.databinding.M04FragmentNotificationBinding
import com.vcc.thth.presentation.view.main.m03_discover.M03DiscoverViewModel
import com.vcc.thth.presentation.widget.viewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class M04NotificationFragment : BaseFragment(R.layout.m04_fragment_notification) {
    private val viewModel: M04NotificationViewModel by viewModels()
    private val binding by viewBinding(M04FragmentNotificationBinding::bind)

    override fun initView() {

    }

    override fun initObserver() {

    }

    override fun getData() {

    }

}