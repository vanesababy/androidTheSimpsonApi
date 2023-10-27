package com.example.thesimpson.network

import com.example.thesimpson.models.Personaje
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WebService {
    @GET ("quotes?count=12")
    suspend fun obtenerPersonaje(): Response<List<Personaje>>


    @GET("quotes")
    suspend fun obtenerPersonaje(
        @Query("character") personaje: String
    ): Response<List<Personaje>>
}