package com.vcc.thth.model.response.notify

data class NotificationList(
    var badge: Int,
    var afterCursor: String,
    var hasAfter: Boolean,
    var updateTime: Long,
    var force: Boolean,
    var timestamp: Long,
    var data: List<Notify>,
    var checkpoint: Long
)
