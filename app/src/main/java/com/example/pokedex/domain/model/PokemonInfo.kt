package com.example.pokedex.domain.model

data class PokemonInfo(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val types: List<String>,
    val moves: List<String>
)
