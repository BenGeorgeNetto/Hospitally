package com.example.hospitally.navigation

sealed class NavigationItem(var route: String) {
    object Home : NavigationItem("home")
    object UserDetails : NavigationItem("user_details")
    object HospitalsNearMe : NavigationItem("hospitals_near_me")
    object Settings : NavigationItem("settings")
    object Favourites : NavigationItem("favourites")
}