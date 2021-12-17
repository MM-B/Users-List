package com.example.userslist

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.userslist.common.ui.screens.HomeScreens
import com.example.userslist.model.ui.User
import com.example.userslist.ui.users.list.UsersScreen
import com.example.userslist.ui.users.profile.ProfileScreen

const val MAIN_NAV_GRAPH_ROUTE = "main"

fun NavGraphBuilder.mainNavGraph(navController: NavController) {
    navigation(startDestination = HomeScreens.List.route, route = MAIN_NAV_GRAPH_ROUTE) {
        composable(route = HomeScreens.List.route) {
            UsersScreen(navController = navController)
        }
        composable(
            route = HomeScreens.Profile.route,
        ) {
            navController.previousBackStackEntry?.savedStateHandle?.get<User>("user")?.let {
                ProfileScreen(navController = navController, user = it)
            }
        }
    }
}