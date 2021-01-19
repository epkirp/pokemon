package com.example.pokemon.di

import com.example.domain.gateways.PokemonsGateway
import com.example.gateway.Api
import com.example.gateway.gateways.RetrofitPokemonsGateway
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ApiModule::class])
class GatewayModule {

    @Provides
    @Singleton
    fun providePokemonsGateway(api: Api): PokemonsGateway {
        return RetrofitPokemonsGateway(api)
    }
}