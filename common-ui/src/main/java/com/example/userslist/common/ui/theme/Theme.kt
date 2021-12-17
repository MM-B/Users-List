package com.example.userslist.common.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

private val LightColors = lightColors(

)

private val Shapes = Shapes(
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(32.dp)
)

@Composable
fun UsersListTheme(content: @Composable () -> Unit) {
    MaterialTheme(
     //   colors = LightColors,
        shapes = Shapes,
        content = content
    )
}