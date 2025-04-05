package fr.iutlan.a04_03_navigation.Screen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val route : String,
    val title : String,
    val icon : ImageVector
) {
    object Home : Screen(
        route="home",
        title="Home",
        icon= Icons.Default.Home
    )
    object FirstScreen : Screen(
        route="first",
        title="Screen1",
        icon= Icons.Default.Home
    )
    object SecondScreen : Screen(
        route="second",
        title="Screen2",
        icon= Icons.Default.Home
    )
    object ThirdScreen: Screen(
        route="third",
        title="Screen3",
        icon= Icons.Default.Home
    )
}