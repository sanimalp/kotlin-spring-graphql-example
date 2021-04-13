package com.example.restservice.graphql.model

data class RacetrackInfo(
    val name: String,
    val countryCode: String,
    val length: Float,
    val lapRecord: String
)
