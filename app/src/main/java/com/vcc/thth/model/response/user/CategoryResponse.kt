package com.vcc.thth.model.response.user

data class CategoryResponse(
    val added: Boolean,
    val detail: String,
    val id: String,
    val image: String,
    val name: String,
    val type: Int,
    val url: String,
    val followed: Boolean,
    val size: Int
)