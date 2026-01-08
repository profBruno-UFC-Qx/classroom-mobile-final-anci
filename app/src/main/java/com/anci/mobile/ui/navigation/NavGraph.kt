package com.anci.mobile.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.anci.mobile.ui.screens.LoginScreen
import com.anci.mobile.ui.screens.HomeScreen
import androidx.compose.material3.Text

@Composable
fun AnciNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Login.route) {
        composable(Screen.Login.route) {
            LoginScreen(
                onLoginSuccess = {
                    navController.navigate(Screen.Home.route) {
                        popUpTo(Screen.Login.route) { inclusive = true }
                    }
                }
            )
        }
        composable(Screen.Home.route) {
            HomeScreen(
                onNavigateToSettings = { navController.navigate(Screen.Settings.route) },
                onNavigateToEmergency = { navController.navigate(Screen.Emergency.route) },
                onNavigateToCourses = { navController.navigate(Screen.Courses.route) },
                onNavigateToSupport = { navController.navigate(Screen.Support.route) }
            )
        }
        composable(Screen.Settings.route) {
            Text(text = "Settings Screen Placeholder")
        }
        composable(Screen.Emergency.route) {
            Text(text = "Emergency Screen Placeholder")
        }
        composable(Screen.Courses.route) {
            Text(text = "Courses Screen Placeholder")
        }
        composable(Screen.Support.route) {
            Text(text = "Support Screen Placeholder")
        }
    }
}
