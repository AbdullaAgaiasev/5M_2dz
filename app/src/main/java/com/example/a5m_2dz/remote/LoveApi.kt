package com.example.a5m_2dz.remote

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApi {

    @GET("getPercentage")
     fun calculatePercentage(
        @Query("fname")firstName:String,
        @Query("sname")secondName:String,
        @Header("X-RapidAPI-Key") key: String = "ed79022b4bmsh600725ba2c9e3dbp12b6a6jsna7a8f4a4a202",
        @Header("X-RapidAPI-Host") host: String = "love-calculator.p.rapidapi.com"
    ) : Call<LoveModel>

}