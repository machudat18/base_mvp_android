package com.vcc.thth.base

import android.os.Bundle
import android.view.View
import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.vcc.thth.R
import com.vcc.thth.helper.InternetUtil


abstract class BaseFragment(@LayoutRes layoutId: Int) : Fragment(layoutId) {
    protected var isConnected: Boolean = false

    //     popupTo: Int? = null =>
    //   if (popupTo != null)
    //                        setPopUpTo(popupTo, false)
    var TAG: String = this.javaClass.simpleName;


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        InternetUtil.observe(viewLifecycleOwner) {
            it?.let {
                isConnected = it
            }
        }
        initView()
        initObserver()
    }


    /**
     * Dùng để khởi tạo view hoặc là những thứ cần thiết liên quan đến view
     * Hàm này được gọi trong onViewCreated
     */
    abstract fun initView()

    /**
     * Dùng để khởi tạo obServer của viewmodel
     * Hàm này được gọi trong onViewCreated, sau initView
     */
    abstract fun initObserver()

    /**
     * Dùng để chứa các hàm gọi ban đầu liên quan đến lấy dữ liệu
     * Rất hữu ích trong việc sử dụng khi refresh dữ liệu mới
     */
    abstract fun getData()
    protected fun navigate(action: NavDirections) {
        findNavController().navigate(action, getNavOptions())
    }

    private fun getNavOptions() = NavOptions.Builder().apply {
        setEnterAnim(R.anim.slide_in_left)
        setExitAnim(R.anim.slide_out_left)
        setPopExitAnim(R.anim.slide_out_right)
        setPopEnterAnim(R.anim.slide_in_right)
//                setPopUpTo(currentDestination?.id!!, false)

    }.build()

    protected fun navigate(
        @IdRes id: Int,
        isReplace: Boolean = false,
        bundle: Bundle? = null,
    ) {
        findNavController().navigate(
            id,
            bundle,
            getNavOptions()
        )
    }

    /**
     * popBackStack
     */
    protected fun pop() {
        findNavController().popBackStack()
    }

    /**
     * Pop màn hình cho tới --->
     */
    protected fun popTo(@IdRes destination: Int) {
        findNavController().popBackStack(destination, true)
    }

    override fun onDestroy() {
        super.onDestroy()

    }
}