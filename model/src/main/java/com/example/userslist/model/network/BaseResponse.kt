package com.example.userslist.model.network

import kotlinx.serialization.Serializable

@Serializable
data class BaseResponse(
    val results: List<UserNetwork>?,
    val info: Info
)