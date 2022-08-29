package com.vcc.thth.model.response.news

import java.io.Serializable

data class DataTopNews(
    val author: String = "",
    val id: String = "",
    val image: String = "",
    val publishDate: Long = 0,
    val displayType: Int = 0,
    val size: Int = 0,
    val sapo: String = "",
    val source: String = "",
    val title: String = "",
    val url: String = "",
    val topicId: String = "",
    val topicName: String = "",
    var list: List<DataTopNewsRelated>? = null,
    var isShow:Boolean = false,
    val domain: Domain = Domain(),
    var type: Int? = null,
    val stream_index: Int? = null,
    val instanceType: Int? = null,
    val width: Int? = null,
    val height: Int? = null,
    val duration: String? = null,
    val view: Int? = null,
    val baseScore: Int? = null,
    val PPR: Int? = null,
    val numberOfClick: Int? = null,
    val numberOfReadChannel: Int? = null,
    val numberOfReadDomain: Int? = null,
    var isRelateDisplay: Boolean = false,
    var items: List<DataTopNewsRelated>? = null,
    var interaction: Interaction? = null,
    var embed: Embed? = null
) : Serializable