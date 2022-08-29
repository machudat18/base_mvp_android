package com.vcc.thth.network

interface ApiCallBack<T> {
    fun onSuccess(data: T)
    fun onFail(data: T? = null, message: String? = null)
}