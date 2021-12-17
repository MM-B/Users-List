package com.example.userslist.ui.users.list

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.userslist.common.ui.screens.HomeScreens
import com.example.userslist.model.ui.User

@Composable
fun UsersScreen(navController: NavController) {
    UsersScreen(navController = navController, viewModel = hiltViewModel())
}

@Composable
private fun UsersScreen(
    navController: NavController,
    viewModel: UsersViewModel,
) {
    Button(onClick = {
        navController.currentBackStackEntry?.savedStateHandle?.set("user", User())
        navController.navigate(HomeScreens.Profile.route)
    }) {
        Text(text = "Salam")
    }
}