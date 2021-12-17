package com.example.userslist.common.ui.screens

sealed class HomeScreens(val route: String) {
    object List : HomeScreens("list")
    object Profile : HomeScreens("profile")
}