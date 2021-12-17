package com.example.userslist.data.repositories

import com.example.userslist.data.datesources.UserRemoteDataSource
import com.example.userslist.domain.repositories.UserRepositoryRepository
import com.example.userslist.model.mapper.toUsers
import com.example.userslist.model.ui.User
import javax.inject.Inject

class UserRepositoryRepositoryImpl @Inject constructor(
    private val userRemoteDataSource: UserRemoteDataSource,
) : UserRepositoryRepository {

    override suspend fun getUsers(): List<User> =
        userRemoteDataSource.getUsers().toUsers()

}