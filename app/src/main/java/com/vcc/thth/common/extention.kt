package com.vcc.thth.common

import android.view.View
import android.view.ViewGroup
import androidx.core.view.marginBottom
import androidx.core.view.marginLeft
import androidx.core.view.marginRight
import androidx.core.view.marginTop
import com.vcc.thth.network.ApiCallBack
import com.vcc.thth.network.Resource

fun View?.show() {
    this?.visibility = View.VISIBLE
}

fun View?.visible(isVisible: Boolean) {
    this?.visibility = if (isVisible) View.VISIBLE else View.GONE
}

fun View?.hide() {
    this?.visibility = View.GONE
}

fun View?.invisible() {
    this?.visibility = View.INVISIBLE
}

fun View?.setMargins(
    left: Int = this!!.marginLeft,
    top: Int = this!!.marginTop,
    right: Int = this!!.marginRight,
    bottom: Int = this!!.marginBottom,
) {
    this!!.layoutParams = (layoutParams as ViewGroup.MarginLayoutParams).apply {
        setMargins(left, top, right, bottom)
    }
}

fun <T> Resource<T>.setCallBack(callBack: ApiCallBack<T>) {
    if (status == Resource.Status.SUCCESS && data != null) {
        callBack.onSuccess(this.data)
    } else {
        callBack.onFail(this.data, message)
    }
}
