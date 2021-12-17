package com.example.userslist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import coil.ImageLoader
import coil.compose.LocalImageLoader
import com.example.userslist.common.ui.theme.UsersListTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var coilImageLoader: ImageLoader

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            val systemUiController = rememberSystemUiController()
            SideEffect {
                systemUiController.setStatusBarColor(color = Color(0xAAe91d77), darkIcons = false)
            }

            UsersListTheme {
                CompositionLocalProvider(
                    LocalImageLoader provides coilImageLoader,
                ) {
                    Surface(Modifier.fillMaxSize()) {
                        NavHost(
                            navController = navController,
                            startDestination = MAIN_NAV_GRAPH_ROUTE
                        ) {
                            mainNavGraph(navController)
                        }
                    }
                }
            }
        }
    }

}