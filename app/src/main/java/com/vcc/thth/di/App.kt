package com.vcc.thth.di

import android.app.Application
import com.google.firebase.FirebaseApp
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.vcc.thth.BuildConfig
import com.vcc.thth.common.Constants
import com.vcc.thth.helper.InternetUtil
import com.vcc.thth.helper.LogsUtil
import com.vcc.thth.helper.PreferenceHelper
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        PreferenceHelper.getInstance().init(this)
        FirebaseApp.initializeApp(this)
        InternetUtil.init(this)

        if (BuildConfig.FLAVOR == Constants.FLAVOR_DEVELOP) {
            FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(false)
            Timber.plant(LogsUtil())
        }
    }
}