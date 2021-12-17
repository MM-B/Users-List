package com.example.userslist.ui.users.list

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.userslist.domain.usecases.GetUsersUesCase
import com.example.userslist.domain.utils.onError
import com.example.userslist.domain.utils.onSuccess
import com.example.userslist.model.ui.User
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch

@HiltViewModel
class UsersViewModel @Inject constructor(
    private val getUsersUesCase: GetUsersUesCase,
) : ViewModel() {

    private var _users = mutableStateListOf<User>()
    val users: SnapshotStateList<User> get() = _users

    init {
        viewModelScope.launch {
            getUsersUesCase().onSuccess {
                _users.addAll(it)
            }.onError {
                println("mmb error $it")
            }
        }
    }
}