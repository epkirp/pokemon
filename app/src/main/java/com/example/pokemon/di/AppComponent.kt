package com.example.pokemon.di

import com.example.pokemon.App
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [GatewayModule::class, ErrorModule::class])
interface AppComponent {

    fun inject(target: App)
}