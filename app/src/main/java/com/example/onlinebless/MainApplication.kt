package com.example.onlinebless

import android.app.Application
import com.example.onlinebless.modules.module
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApplication)
            modules(listOf(
                module,
            )) }
    }
}