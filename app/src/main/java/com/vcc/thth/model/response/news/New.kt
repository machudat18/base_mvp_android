package com.vcc.thth.model.response.news

data class New(
    val algId: String = "",
    val dspId: String = "",
    val boxId: String = " ",
    val data: List<DataTopNews> = listOf(),
    val tag: String = "",
    var type: Int = -1
)
