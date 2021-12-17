package com.example.userslist.model.network

import kotlinx.serialization.Serializable

@Serializable
data class Dob(
    val date: String = "",
    val age: Int = 0
)