package com.example.userslist.ui.users.profile

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.userslist.model.ui.User

@Composable
fun ProfileScreen(navController: NavController, user: User) {
    Text(text = user.toString())
    ProfileScreen(navController = navController, viewModel = hiltViewModel())
}

@Composable
private fun ProfileScreen(navController: NavController, viewModel: ProfileViewModel) {

}