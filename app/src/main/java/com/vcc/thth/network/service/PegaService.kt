package com.vcc.thth.network.service

import com.vcc.thth.model.response.user.HabitSiteResponse
import com.vcc.thth.network.ApiResponseData
import com.vcc.thth.network.Endpoint
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PegaService {
    @GET(Endpoint.GET_HABIT_SITES)
    suspend fun getHabitSite(
        @Query("deviceid") deviceId: String,
        @Query("userid") userId: String
    ): Response<ApiResponseData<List<HabitSiteResponse>>>

}