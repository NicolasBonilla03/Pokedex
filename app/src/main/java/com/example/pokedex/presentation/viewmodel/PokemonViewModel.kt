package com.example.pokedex.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokedex.data.model.PokemonDetail
import com.example.pokedex.data.repository.PokemonRepository
import com.example.pokedex.domain.mapper.toDomainModelList
import com.example.pokedex.domain.model.PokemonInfo
import kotlinx.coroutines.launch

class PokemonViewModel(private val repository: PokemonRepository) : ViewModel() {

    val pokemons = mutableListOf<PokemonInfo>()

    fun loadPokemons(region: String) {
        viewModelScope.launch {
            // Obtener los datos de los Pokémon desde el repositorio
            val pokemonDetails: List<PokemonDetail> = repository.getPokemonsByRegion(region)

            // Convertir los detalles a un modelo más simple para la UI
            pokemons.clear()
            pokemons.addAll(pokemonDetails.toDomainModelList()) // Esta línea debe funcionar ahora
        }
    }
}
