package com.farid.yjahzapplication

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class YjahzApplication:Application() {


    companion object {
        lateinit var instance: YjahzApplication
            private set
    }
}