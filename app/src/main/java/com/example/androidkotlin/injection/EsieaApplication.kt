package com.example.androidkotlin.injection

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class EsieaApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@EsieaApplication)
            modules(presentationModule)
        }
    }
}