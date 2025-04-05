package fr.iutlan.a04_03_navigation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import fr.iutlan.a04_03_navigation.Screen.FirstScreen
import fr.iutlan.a04_03_navigation.Screen.HomeScreen
import fr.iutlan.a04_03_navigation.Screen.Screen
import fr.iutlan.a04_03_navigation.Screen.SecondScreen
import fr.iutlan.a04_03_navigation.Screen.ThirdScreen

@Composable
fun SetupNavGraph(navController: NavHostController,modifier: Modifier) {
    NavHost(
        navController=navController,
        startDestination = Screen.Home.route
        ){
        composable(
            route = Screen.Home.route,
        ){
            HomeScreen(navController)
        }
        composable(
            route = Screen.FirstScreen.route,
        ){
            FirstScreen(navController)
        }
        composable(
            route = Screen.SecondScreen.route,
        ){
            SecondScreen(navController)
        }
        composable(
            route = Screen.ThirdScreen.route,
        ){
            ThirdScreen(navController)
        }
    }
}