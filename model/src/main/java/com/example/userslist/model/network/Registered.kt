package com.example.userslist.model.network

import kotlinx.serialization.Serializable

@Serializable
data class Registered(
    val date: String = "",
    val age: Int = 0
)