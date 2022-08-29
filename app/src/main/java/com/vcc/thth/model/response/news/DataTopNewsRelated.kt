package com.vcc.thth.model.response.news

data class DataTopNewsRelated(
    val author: String,
    val id: String,
    val image: String,
    val publishDate: Long,
    val displayType: Int,
    val size: Int,
    val sapo: String,
    val source: String,
    val title: String,
    val url: String,
    val topicId: String?,
    val topicName: String?,
    val domain: Domain = Domain()
)
