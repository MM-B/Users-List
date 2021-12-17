package com.example.userslist

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.userslist.common.ui.screens.HomeScreens

const val MAIN_NAV_GRAPH_ROUTE = "main"

fun NavGraphBuilder.mainNavGraph(navController: NavController) {
    navigation(startDestination = HomeScreens.List.route, route = MAIN_NAV_GRAPH_ROUTE) {
        composable(route = HomeScreens.List.route) {
        }
        composable(route = HomeScreens.Profile.route) {
        }
    }
}