package com.anci.mobile.ui.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Login : Screen("login")
    object Home : Screen("home")
    object Settings : Screen("settings")
    object Appearance : Screen("appearance")
    object Emergency : Screen("emergency")
    object Courses : Screen("courses")
    object Support : Screen("support")
}
