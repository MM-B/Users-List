package com.example.userslist.ui.users.list

import androidx.lifecycle.ViewModel
import com.example.userslist.domain.usecases.GetUsersUesCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UsersViewModel @Inject constructor(
    private val getUsersUesCase: GetUsersUesCase,
) : ViewModel() {


}