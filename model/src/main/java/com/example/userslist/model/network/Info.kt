package com.example.userslist.model.network

import kotlinx.serialization.Serializable

@Serializable
data class Info(
    val seed: String = "",
    val page: Int = 0,
    val results: Int = 0,
    val version: String = ""
)