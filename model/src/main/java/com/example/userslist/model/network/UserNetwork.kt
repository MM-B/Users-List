package com.example.userslist.model.network

import kotlinx.serialization.Serializable

@Serializable
data class UserNetwork(
    val nat: String = "",
    val gender: String = "",
    val phone: String = "",
    val dob: Dob,
    val name: Name,
    val registered: Registered,
    val location: Location,
    val id: Id,
    val login: Login,
    val cell: String = "",
    val email: String = "",
    val picture: Picture
)