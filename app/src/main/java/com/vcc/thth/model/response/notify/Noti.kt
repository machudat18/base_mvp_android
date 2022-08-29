package com.vcc.thth.model.response.notify

data class Noti(
    var type: Int,
    var pega: PegaNotiInfo,
    val extension: Extension,
    var owner: Owner
)




