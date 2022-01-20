package com.example.ku_map

import android.app.Application

class KonkukMapApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // initialize Amplify when application is starting
        Backend.initialize(applicationContext)
    }
}
