package com.example.userslist.domain.repositories

import com.example.userslist.model.ui.User

interface UserRepositoryRepository {

    suspend fun getUsers(): List<User>
}