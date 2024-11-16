package com.example.pokedex.data.model

import com.google.gson.annotations.SerializedName

data class Region(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String // URL para obtener la lista de pokémon en esta región
)
