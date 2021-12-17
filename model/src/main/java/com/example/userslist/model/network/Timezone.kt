package com.example.userslist.model.network

import kotlinx.serialization.Serializable

@Serializable
data class Timezone(
    val offset: String = "",
    val description: String = ""
)