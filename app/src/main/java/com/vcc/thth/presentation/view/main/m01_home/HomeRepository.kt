package com.vcc.thth.presentation.view.main.m01_home

import com.vcc.thth.network.data_source.ApiDataSource
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class HomeRepository @Inject constructor(private val apiDataSource: ApiDataSource) {

    suspend fun getHabitSites() = flow {
        emit(apiDataSource.getHabitSite())
    }
}

