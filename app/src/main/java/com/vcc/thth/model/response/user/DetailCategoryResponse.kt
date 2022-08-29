package com.vcc.thth.model.response.user

data class DetailCategoryResponse(
    var followed: Boolean,
    val name: String,
    val type: Int,
    val url: String,
    val detail: String,
    val image: String,
    val id: String
)