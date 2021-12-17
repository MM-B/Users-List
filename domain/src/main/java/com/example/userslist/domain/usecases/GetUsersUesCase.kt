package com.example.userslist.domain.usecases

import com.example.userslist.domain.baseusecases.UseCase
import com.example.userslist.domain.coroutineUtils.IoDispatcher
import com.example.userslist.domain.repositories.UserRepositoryRepository
import com.example.userslist.model.ui.User
import javax.inject.Inject
import kotlinx.coroutines.CoroutineDispatcher

class GetUsersUesCase @Inject constructor(
    private val userRepositoryRepository: UserRepositoryRepository,
    @IoDispatcher dispatcher: CoroutineDispatcher,
) : UseCase<List<User>>(dispatcher) {

    override suspend fun execute(): List<User> =
        userRepositoryRepository.getUsers()

}