package com.example.userslist

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import coil.ImageLoader
import com.example.userslist.common.ui.theme.UsersListTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var coilImageLoader: ImageLoader

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        setContent {
            val navController = rememberNavController()
            UsersListTheme {
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