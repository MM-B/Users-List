package com.example.userslist.model.network

import kotlinx.serialization.Serializable

@Serializable
data class Name(
    val last: String = "",
    val title: String = "",
    val first: String = ""
)