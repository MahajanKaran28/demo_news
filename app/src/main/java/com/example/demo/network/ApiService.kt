package com.example.demo.network

import com.example.demo.models.AlertsResponseClass
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface ApiService {

    @GET("top-headlines")
    suspend fun getExpenseLists(@QueryMap data: HashMap<String, @JvmSuppressWildcards Any>): AlertsResponseClass
}