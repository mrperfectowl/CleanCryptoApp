package com.example.cleancryptoapp.presentation.ui

import com.example.cleancryptoapp.domain.model.Coin

sealed interface CoinListState {
    object Loading : CoinListState
    class Success(val coins: List<Coin>) : CoinListState
    class Error(val error: String) : CoinListState
}