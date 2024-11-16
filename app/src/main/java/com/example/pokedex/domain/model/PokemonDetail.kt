package com.example.pokedex.data.model

import com.google.gson.annotations.SerializedName

data class PokemonDetail(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("types") val types: List<TypeSlot>,
    @SerializedName("sprites") val sprites: Sprites,
    @SerializedName("moves") val moves: List<MoveSlot>
)

data class TypeSlot(
    @SerializedName("slot") val slot: Int,
    @SerializedName("type") val type: Type
)

data class Sprites(
    @SerializedName("front_default") val frontDefault: String?,
    @SerializedName("front_shiny") val frontShiny: String?
)

data class MoveSlot(
    @SerializedName("move") val move: Move
)

data class Move(
    @SerializedName("name") val name: String
)
