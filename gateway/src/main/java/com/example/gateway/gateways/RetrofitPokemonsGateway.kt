package com.example.gateway.gateways

import com.example.domain.entities.PaginationEntity
import com.example.domain.gateways.PokemonsGateway
import com.example.gateway.Api
import io.reactivex.rxjava3.core.Single

class RetrofitPokemonsGateway(private val api: Api) : PokemonsGateway {

    override fun getPokemons(offset: Int, limit: Int): Single<PaginationEntity> {
        return api.getPokemons(offset, limit)
    }
}