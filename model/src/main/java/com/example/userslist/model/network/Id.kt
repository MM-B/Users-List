package com.example.userslist.model.network

import kotlinx.serialization.Serializable

@Serializable
data class Id(
    val name: String? = "",
    val value: String? = ""
)