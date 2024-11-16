package com.example.pokedex.data.repository

import com.example.pokemonapp.data.api.PokemonApiService

class PokemonRepository(private val api: PokemonApiService) {

    suspend fun getRegions() = api.getRegions()

    suspend fun getPokemonsByRegion(region: String) = api.getPokemonsByRegion(region)

    suspend fun getPokemonDetail(idOrName: String) = api.getPokemonDetail(idOrName)
}
