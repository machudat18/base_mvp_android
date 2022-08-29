package com.vcc.thth.presentation.view.main.m02_trend.state

import com.vcc.thth.model.response.news.TopNewsResponse
import com.vcc.thth.network.StateStatus

class TrendState(
    val response: TopNewsResponse? = null,
    val stateStatus: StateStatus? = null,
    val msg: String? = null
) {
    companion object {
        fun loadSuccess(response: TopNewsResponse, msg: String? = null) =
            TrendState(response, StateStatus.SUCCESS, msg)

        fun loading(msg: String? = null) = TrendState(null, StateStatus.LOADING, msg)

        fun loadFail(response: TopNewsResponse? = null, msg: String? = null) =
            TrendState(response, StateStatus.FAIL, msg)
    }

}