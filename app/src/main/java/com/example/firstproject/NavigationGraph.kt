package com.example.firstproject

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.firstproject.screens.AnalyticScreen
import com.example.firstproject.screens.FlashScreen
import com.example.firstproject.screens.MenuScreen
import com.example.firstproject.screens.SettingScreen
import com.example.firstproject.screens.TrainingScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = ScreensNamesForNav.FlashScreen.route
    ) {
        composable(
            route = ScreensNamesForNav.FlashScreen.route
        ) {
            FlashScreen(navController = navController)
        }
        composable(
            route = ScreensNamesForNav.MenuScreen.route
        ) {
            MenuScreen(
                navController = navController
            )
        }
        composable(
            route = ScreensNamesForNav.SettingScreen.route
        ) {
            SettingScreen()
        }
        composable(
            route = ScreensNamesForNav.AnalyticScreen.route
        ) {
            AnalyticScreen()
        }
        composable(
            route = ScreensNamesForNav.TrainingScreen.route
        ) {
            TrainingScreen()
        }
    }
}

