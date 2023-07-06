package com.example.superheroapp.data.service

import com.example.superheroapp.data.model.SuperHeroData
import com.example.superheroapp.data.model.SuperHeroDetailResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("10230006510727729/search/{name}")
    suspend fun getSuperHeroes(@Path("name") superHeroName: String):Response<SuperHeroData>

    @GET("10230006510727729/{id}")
    suspend fun getSuperHeroDetail(@Path("id") superHeroId:String):Response<SuperHeroDetailResponse>
}