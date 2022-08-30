package com.vcc.thth.presentation.view.main

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.view.WindowManager
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.vcc.thth.R
import com.vcc.thth.base.BaseFragment
import com.vcc.thth.common.Constants.TabHome.DISCOVER
import com.vcc.thth.common.Constants.TabHome.HOME
import com.vcc.thth.common.Constants.TabHome.NOTIFICATION
import com.vcc.thth.common.Constants.TabHome.TREND
import com.vcc.thth.common.Constants.TabHome.USER
import com.vcc.thth.common.hide
import com.vcc.thth.common.show
import com.vcc.thth.databinding.M00FragmentMainBinding
import com.vcc.thth.presentation.view.main.m01_home.M01HomeFragment
import com.vcc.thth.presentation.view.main.m02_trend.M02TrendFragment
import com.vcc.thth.presentation.view.main.m03_discover.M03DiscoverFragment
import com.vcc.thth.presentation.view.main.m04_notification.M04NotificationFragment
import com.vcc.thth.presentation.view.main.m05_user.M05UserFragment
import com.vcc.thth.presentation.widget.CustomTab
import com.vcc.thth.presentation.widget.viewBinding
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe


class M00MainFragment : BaseFragment(R.layout.m00_fragment_main) {
    private val binding by viewBinding(M00FragmentMainBinding::bind)
    private var numBadgeNoti: Int? = null

    private val listFragment = listOf<Fragment>(
        M01HomeFragment(),
        M02TrendFragment(),
        M03DiscoverFragment(),
        M04NotificationFragment(),
        M05UserFragment()
    )
    private val listIcon = listOf(
        R.drawable.ic_tab_home,
        R.drawable.ic_tab_trend,
        R.drawable.ic_tab_discover,
        R.drawable.ic_tab_notification,
        R.drawable.ic_tab_user
    )
    private val listText = listOf(
        R.string.tab_home,
        R.string.tab_trend,
        R.string.tab_discover,
        R.string.tab_notification,
        R.string.tab_user,
    )

    override fun initView() {
        val pagerAdapter = M00ViewPagerAdapter(
            listFragment,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        binding.pager.adapter = pagerAdapter
        binding.pager.isUserInputEnabled = false
        TabLayoutMediator(binding.tabLayout, binding.pager) { tab, position ->
            if (numBadgeNoti == null) numBadgeNoti = 0
            tab.customView = getCustomViewTab(
                ContextCompat.getDrawable(requireContext(), listIcon[position]),
                getString(listText[position]),
                numBadgeNoti!!, position
            )
        }.attach()
        binding.pager.offscreenPageLimit = listFragment.size
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                (tab?.customView as CustomTab).isSelected = true
                when (tab.position) {
                    HOME -> {}
                    TREND -> {}
                    DISCOVER -> {}
                    NOTIFICATION -> {}
                    USER -> {}
                }

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                (tab?.customView as CustomTab).isSelected = false
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    HOME -> {}
                    TREND -> {}
                    DISCOVER -> {}
                    NOTIFICATION -> {}
                    USER -> {}
                }
            }

        })
    }

    private fun getCustomViewTab(
        image: Drawable?,
        text: String,
        numBadge: Int,
        position: Int
    ): CustomTab {
        val tab = CustomTab(requireContext())
        tab.icon.setImageDrawable(image)
        tab.text.text = text
        if (position == 3) {
            tab.notiBadge.show()
            when (numBadge) {
                in 1..99 -> {
                    tab.notiBadge.text = numBadge.toString()
                }
                0 -> {
                    tab.notiBadge.hide()
                }
                else -> {
                    tab.notiBadge.text = "99+"
                }
            }
        }
        return tab
    }

    override fun initObserver() {
    }

    override fun getData() {
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onStart() {
        super.onStart()
        if (!EventBus.getDefault().isRegistered(this)) EventBus.getDefault().register(this)
    }

    override fun onStop() {
        super.onStop()
        EventBus.getDefault().unregister(this)
    }

    @Subscribe
    fun eventMain(data: String) {

    }
}