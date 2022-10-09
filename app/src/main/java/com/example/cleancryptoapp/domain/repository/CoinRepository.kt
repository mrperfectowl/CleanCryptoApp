package com.example.cleancryptoapp.domain.repository

import com.example.cleancryptoapp.data.remote.response.CoinResponse

interface CoinRepository {
    suspend fun getCoins(): List<CoinResponse>
}