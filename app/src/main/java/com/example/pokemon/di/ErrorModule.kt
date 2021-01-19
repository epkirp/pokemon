package com.example.pokemon.di

import com.example.domain.handlers.ErrorHandler
import com.example.gateway.handlers.ErrorHandlerImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ErrorModule {

    @Provides
    @Singleton
    fun provideErrorHandler(): ErrorHandler {
        return ErrorHandlerImpl()
    }
}