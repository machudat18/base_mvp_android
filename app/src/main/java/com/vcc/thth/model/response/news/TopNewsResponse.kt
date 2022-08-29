package com.vcc.thth.model.response.news

data class TopNewsResponse(
    val code: Int,
    val data: Data,
    val message: String,
    val status: Int
)
