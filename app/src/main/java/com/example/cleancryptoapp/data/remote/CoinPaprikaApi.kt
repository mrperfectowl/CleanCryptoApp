package com.example.cleancryptoapp.data.remote

import com.example.cleancryptoapp.data.remote.response.CoinResponse
import retrofit2.http.GET

interface CoinPaprikaApi {
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinResponse>
}