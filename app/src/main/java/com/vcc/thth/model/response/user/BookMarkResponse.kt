package com.vcc.thth.model.response.user

data class BookMarkResponse(
    val id: String,
    val publishDate: Long,
    val source: String,
    val sourceImage: String,
    val title: String,
    val url: String,
    val type: String
)