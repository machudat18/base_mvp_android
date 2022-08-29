package com.vcc.thth.model.response.notify

data class MarkReadResponse(
    val code: Int,
    val message: String,
    val status: Int,
    val result: ResultMarkRead
)