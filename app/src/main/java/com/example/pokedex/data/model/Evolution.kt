package com.example.pokedex.data.model

import com.google.gson.annotations.SerializedName

data class EvolutionChain(
    @SerializedName("chain") val chain: EvolutionNode
)

data class EvolutionNode(
    @SerializedName("species") val species: EvolutionSpecies,
    @SerializedName("evolves_to") val evolvesTo: List<EvolutionNode>
)

data class EvolutionSpecies(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
)
