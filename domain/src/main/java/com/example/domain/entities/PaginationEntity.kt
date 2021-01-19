package com.example.domain.entities

data class PaginationEntity(
    val count: Int,
    val next: String?,
    val result: List<PokemonEntity>?
)