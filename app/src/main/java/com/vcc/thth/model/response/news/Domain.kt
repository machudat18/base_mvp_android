package com.vcc.thth.model.response.news

import java.io.Serializable

data class Domain(
    val image: String ="",
    val color: String = "",
    val name: String ="",
    val detail: String ="",
    val url: String = "",
    val id: String = "",
    val num_follow:Int = 0
): Serializable
