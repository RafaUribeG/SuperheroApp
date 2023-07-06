package com.example.superheroapp.data.model

import com.google.gson.annotations.SerializedName

data class SuperHeroData(
    @SerializedName("response") val response: String,
    @SerializedName("results") val superHeroes: List<SuperHeroItemResponse>
)

data class SuperHeroItemResponse(
    @SerializedName("id") val superheroId: String,
    @SerializedName("name") val name: String,
    @SerializedName("image") val superHeroImage: SuperHeroImageResponse
)

data class SuperHeroImageResponse(@SerializedName("url") val url:String)