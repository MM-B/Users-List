package com.example.userslist.data.datesources

import com.example.userslist.data.api.UserApiService
import com.example.userslist.data.utils.bodyOrThrow
import com.example.userslist.model.network.UserNetwork
import javax.inject.Inject

class UserRemoteDataSourceImpl @Inject constructor(
    private val userApiService: UserApiService,
) : UserRemoteDataSource {

    override suspend fun getUsers(): List<UserNetwork> =
        userApiService.getUsers().bodyOrThrow().results

}