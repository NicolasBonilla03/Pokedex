package com.example.pokedex.data.model

import com.google.gson.annotations.SerializedName

data class Pokemon(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String // Contiene la URL para obtener más detalles del pokémon
)
