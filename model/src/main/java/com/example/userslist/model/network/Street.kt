package com.example.userslist.model.network

import kotlinx.serialization.Serializable

@Serializable
data class Street(
    val number: Int = 0,
    val name: String = ""
)