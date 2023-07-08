package com.example.hospitally.navigation

import FavouritesScreen
import HospitalsNearMeScreen
import SettingsScreen
import UserDetailsScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.hospitally.ui.screens.HomeScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController, startDestination = NavigationItem.Home.route) {
        composable(NavigationItem.Home.route) {
            HomeScreen(navController)
        }
        composable(NavigationItem.HospitalsNearMe.route) {
            HospitalsNearMeScreen(navController)
        }
        composable(NavigationItem.UserDetails.route) {
            UserDetailsScreen(navController)
        }
        composable(NavigationItem.Settings.route) {
            SettingsScreen(navController)
        }
        composable(NavigationItem.Favourites.route) {
            FavouritesScreen(navController)
        }

    }
}
