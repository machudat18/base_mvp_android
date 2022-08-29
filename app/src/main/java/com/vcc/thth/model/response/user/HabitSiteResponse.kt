package com.vcc.thth.model.response.user

data class HabitSiteResponse(
    val domain: String?,
    val followed: Boolean?,
    val image: String?,
    val name: String?,
    val siteid: String?,
    val total: Int?,
    val type: Int?,
    val url: String?
)