package com.example.projecktnewcompose.presintation.screens

sealed class Screens(val route: String) {
    object MainOne : Screens(route = "MainOne")
    object Maintwo : Screens(route = "Maintwo")
    object MainThird : Screens(route = "MainThird")
}
