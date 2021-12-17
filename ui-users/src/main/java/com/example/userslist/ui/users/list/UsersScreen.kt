package com.example.userslist.ui.users.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.userslist.common.ui.screens.HomeScreens

@Composable
fun UsersScreen(navController: NavController) {
    UsersScreen(navController = navController, viewModel = hiltViewModel())
}

@Composable
private fun UsersScreen(
    navController: NavController,
    viewModel: UsersViewModel,
) {

    if (viewModel.users.isEmpty()) {
        Box(modifier = Modifier.fillMaxSize()) {
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = "Please Wait"
            )
        }
    }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ) {
        items(viewModel.users) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable {
                        navController.currentBackStackEntry?.savedStateHandle?.set("user", it)
                        navController.navigate(HomeScreens.Profile.route)
                    },
                shape = MaterialTheme.shapes.small,
                elevation = 8.dp,
            ) {
                Row(
                    modifier = Modifier.padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Image(
                        painter = rememberImagePainter(it.avatar),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(64.dp)
                            .clip(CircleShape)
                            .border(2.dp, Color.Gray, CircleShape)
                    )

                    Spacer(modifier = Modifier.width(20.dp))

                    Column(verticalArrangement = Arrangement.SpaceEvenly) {
                        Text(
                            text = "${it.firstName},${it.age}",
                            style = MaterialTheme.typography.body1,
                            color = Color.Black,
                        )
                        Text(
                            text = "${it.city},${it.street}",
                            style = MaterialTheme.typography.caption,
                            color = Color.Gray,
                        )

                    }
                }
            }
        }
    }
}