package com.example.projecktnewcompose.presintation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projecktnewcompose.presintation.screens.MainOne
import com.example.projecktnewcompose.presintation.screens.MainThird
import com.example.projecktnewcompose.presintation.screens.Maintwo
import com.example.projecktnewcompose.presintation.screens.Screens


@Composable
fun MainNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.MainOne.route,
    ) {

        composable(route = Screens.MainOne.route) {
            MainOne(onClickCallBack = { navController.navigate(Screens.Maintwo.route) })
        }
        composable(route = Screens.Maintwo.route) {
            Maintwo(mainCallBack = {navController.navigate(Screens.MainThird.route)})
        }
        composable(route = Screens.MainThird.route) {
            MainThird(callBack = {navController.popBackStack()})
        }
    }
}
