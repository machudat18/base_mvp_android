package com.vcc.thth.model.response.notify

data class Notify(
    val notificationID: String?,
    val timestamp: Long,
    var isRead: Int,
    val version: String,
    val badge: Int,
    val event: Int,
    val data: Noti?,
    val append: Boolean,
    val community: Boolean
)