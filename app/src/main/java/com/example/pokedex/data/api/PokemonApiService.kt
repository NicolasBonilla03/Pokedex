package com.example.pokemonapp.data.api

import com.example.pokedex.data.model.Pokemon
import com.example.pokedex.data.model.Region
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonApiService {
    @GET("region/")
    suspend fun getRegions(): List<Region>

    @GET("pokedex/{region}/")
    suspend fun getPokemonsByRegion(@Path("region") region: String): List<Pokemon>

    @GET("pokemon/{id_or_name}/")
    suspend fun getPokemonDetail(@Path("id_or_name") idOrName: String): Pokemon
}
