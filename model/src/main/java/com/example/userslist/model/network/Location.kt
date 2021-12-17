package com.example.userslist.model.network

import kotlinx.serialization.Serializable

@Serializable
data class Location(
    val country: String = "",
    val city: String = "",
    val street: Street,
    val state: String = ""
)