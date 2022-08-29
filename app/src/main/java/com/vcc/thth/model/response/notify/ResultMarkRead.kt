package com.vcc.thth.model.response.notify

data class ResultMarkRead(
    val badge: Int,
    val updateTime: Long,
    val force: Boolean,
    val timestamp: Long
)