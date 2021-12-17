package com.example.userslist.model.network

import kotlinx.serialization.Serializable

@Serializable
data class BaseResponse<T>(
    val results: List<T> = emptyList(),
    val info: Info
)