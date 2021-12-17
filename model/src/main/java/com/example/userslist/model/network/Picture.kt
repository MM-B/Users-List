package com.example.userslist.model.network

import kotlinx.serialization.Serializable

@Serializable
data class Picture(
    val thumbnail: String = "",
    val large: String = "",
    val medium: String = ""
)