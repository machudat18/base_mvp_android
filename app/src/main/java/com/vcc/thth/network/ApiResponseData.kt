package com.vcc.thth.network

data class ApiResponseData<T>(
    var code: Int,
    var message: String,
    var status: Int,
    var data : T
)