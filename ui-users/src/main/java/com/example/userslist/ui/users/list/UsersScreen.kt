package com.example.userslist.ui.users.list

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
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

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp)
    ) {
        items(viewModel.users) {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 4.dp, vertical = 6.dp),
                shape = MaterialTheme.shapes.medium
            ) {
                Row {

                }
            }
        }
    }


    Button(onClick = {
        navController.currentBackStackEntry?.savedStateHandle?.set("user", User())
        navController.navigate(HomeScreens.Profile.route)
    }) {
        Text(text = "Salam")
    }
}