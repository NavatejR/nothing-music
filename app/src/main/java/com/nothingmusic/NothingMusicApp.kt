package com.nothingmusic

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class NothingMusicApp : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}