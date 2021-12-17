package com.example.userslist.ui.users.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.userslist.model.ui.User

@Composable
fun ProfileScreen(navController: NavController, user: User) {
    ProfileScreen(user = user)
}

@Composable
private fun ProfileScreen(user: User) {
    Column(modifier = Modifier.fillMaxSize()) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.33f),
            shape = RoundedCornerShape(bottomStart = 26.dp, bottomEnd = 26.dp),
            elevation = 6.dp,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color(0xAAe91d77),
                                Color(0xFFd73262),
                            )
                        )
                    ),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {

                Text(
                    text = "Profile",
                    style = MaterialTheme.typography.h5,
                    color = Color.White,
                )

                Spacer(modifier = Modifier.height(30.dp))

                Image(
                    painter = rememberImagePainter(user.picture),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(85.dp)
                        .clip(CircleShape)
                        .border(2.dp, Color.White, CircleShape)
                )

                Spacer(modifier = Modifier.height(15.dp))

                Text(
                    text = "${user.firstName} ${user.lastName}",
                    style = MaterialTheme.typography.body1,
                    color = Color.White,
                )
                Text(
                    text = "${user.age} years old",
                    style = MaterialTheme.typography.body1,
                    color = Color.White,
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {


                    ProfileInformation(title = "Country", value = user.country)

                    Divider(
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(2.dp),
                        color = Color.White,
                    )

                    ProfileInformation(title = "City", value = user.city)

                    Divider(
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(2.dp),
                        color = Color.White,
                    )

                    ProfileInformation(title = "Street", value = user.street)

                }

            }
        }

        Column {
            InformationCard(backgroundColor = Color(0xFFbd8cde), title = "Phone", value = user.phone)

            InformationCard(backgroundColor = Color(0xFFbd8cde), title = "Cell", value = user.cell)

            InformationCard(backgroundColor = Color(0xFFbd8cde), title = "Email", value = user.email)
        }
    }
}

@Composable
private fun ProfileInformation(title: String, value: String) {
    Column(
        modifier = Modifier.fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Text(
            text = value,
            style = MaterialTheme.typography.body1,
            color = Color.White,
        )
        Text(
            text = title,
            style = MaterialTheme.typography.caption,
            color = Color(0xFFc9c9c9),
        )
    }
}

@Composable
private fun InformationCard(backgroundColor: Color, title: String, value: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = MaterialTheme.shapes.small,
        elevation = 8.dp,
        backgroundColor = backgroundColor
    ) {
        Row(
            modifier = Modifier.padding(vertical = 8.dp, horizontal = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.body1,
                color = Color(0xFFeeebf0),
            )
            Text(
                text = value,
                style = MaterialTheme.typography.h6,
                color = Color.Black,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}