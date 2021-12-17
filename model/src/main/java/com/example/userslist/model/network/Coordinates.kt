package com.example.userslist.model.network

import kotlinx.serialization.Serializable

@Serializable
data class Coordinates(
    val latitude: String = "",
    val longitude: String = ""
)