package com.example.pokedex.domain.mapper

import com.example.pokedex.data.model.PokemonDetail
import com.example.pokedex.domain.model.PokemonInfo

// Mapper para convertir PokemonDetail a PokemonInfo (modelo más simple)
fun PokemonDetail.toDomainModel(): PokemonInfo {
    return PokemonInfo(
        id = this.id,
        name = this.name.capitalize(),
        imageUrl = this.sprites.frontDefault ?: "",
        types = this.types.map { it.type.name.capitalize() },
        moves = this.moves.map { it.move.name.capitalize() }
    )
}

// Mapper para convertir una lista de PokemonDetail a una lista de PokemonInfo
fun List<PokemonDetail>.toDomainModelList(): List<PokemonInfo> {
    return this.map { it.toDomainModel() }
}
