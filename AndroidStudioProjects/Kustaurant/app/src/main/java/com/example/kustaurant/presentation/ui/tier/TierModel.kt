package com.example.kustaurant

data class TierModel(
    val restaurantId: Int,
    val restaurantRanking: Int,
    val restaurantName: String,
    val restaurantCuisine: String,
    val restaurantPosition: String,
    val restaurantImgUrl: String,
    val mainTier: Int,
    val isEvaluated: Boolean,
    val isFavorite: Boolean,
    val x: Double,
    val y: Double,
    val partnershipInfo: String
)
