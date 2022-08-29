package com.vcc.thth.presentation.view

import androidx.navigation.fragment.navArgs
import com.vcc.thth.R
import com.vcc.thth.base.BaseFragment
import com.vcc.thth.databinding.M06FragmentDemoBinding
import com.vcc.thth.helper.Utility
import com.vcc.thth.presentation.widget.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class M06DemoFragment : BaseFragment(R.layout.m06_fragment_demo) {
    private val args: M06DemoFragmentArgs by navArgs()
    private val binding by viewBinding(M06FragmentDemoBinding::bind)

    override fun initView() {
        val x = args.demo?.name
        Timber.tag(TAG).e("initView: %s", x)
        Utility.setImage(
            requireContext(),
            binding.image,
            "https://d5nunyagcicgy.cloudfront.net/external_assets/hero_examples/hair_beach_v391182663/original.jpeg"
        )
    }

    override fun initObserver() {

    }

    override fun getData() {

    }

}