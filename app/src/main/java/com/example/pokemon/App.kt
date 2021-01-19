package com.example.pokemon

import android.app.Application
import com.example.pokemon.di.AppComponent
import com.example.pokemon.di.AppModule
import com.example.pokemon.di.DaggerAppComponent

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent
            .builder()
            .appModule(AppModule(this))
            .build()

        appComponent.inject(this)
    }

    companion object {
        lateinit var appComponent: AppComponent
    }
}