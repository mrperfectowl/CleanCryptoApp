package com.example.cleancryptoapp.data.repository

import com.example.cleancryptoapp.data.remote.CoinPaprikaApi
import com.example.cleancryptoapp.data.remote.response.CoinResponse
import com.example.cleancryptoapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinResponse> {
        return api.getCoins()
    }
}