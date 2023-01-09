package com.zalo.runningapp

import android.app.Application
import android.os.Debug
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

/**
Created by zaloaustine in 1/9/23.
 */
@HiltAndroidApp
class RunApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}