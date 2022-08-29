package com.vcc.thth.model.response.notify

data class PegaNotiInfo(
    val displayType: String,
    val id: String,
    val url: String,
    val page_name: String?,
    val logo: String,
    val topic_name: String?,
    val newsType: String?
)
