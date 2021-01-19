package com.example.domain.gateways

import com.example.domain.entities.PaginationEntity
import io.reactivex.rxjava3.core.Single

interface PokemonsGateway {
    fun getPokemons(offset: Int, limit: Int): Single<PaginationEntity>
}