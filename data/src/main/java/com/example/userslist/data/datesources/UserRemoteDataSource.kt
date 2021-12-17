package com.example.userslist.data.datesources

import com.example.userslist.model.network.UserNetwork

interface UserRemoteDataSource {

    suspend fun getUsers(): List<UserNetwork>
}