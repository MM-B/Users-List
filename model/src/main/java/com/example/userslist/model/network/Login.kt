package com.example.userslist.model.network

import kotlinx.serialization.Serializable

@Serializable
data class Login(
    val sha1: String = "",
    val password: String = "",
    val salt: String = "",
    val sha256: String = "",
    val uuid: String = "",
    val username: String = "",
    val md: String = ""
)