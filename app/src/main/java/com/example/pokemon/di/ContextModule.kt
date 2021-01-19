package com.example.pokemon.di

import android.content.Context
import com.example.pokemon.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [AppModule::class])
class ContextModule {

    @Provides
    @Singleton
    fun provideContext(app: App): Context = app.applicationContext
}