package com.vcc.thth.presentation.view.main.m04_notification

import com.vcc.thth.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class M04NotificationViewModel @Inject constructor(private val notiRepo: NotificationRepository) : BaseViewModel() {}