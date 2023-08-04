package com.example.translator.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.translator.presentation.view.main.MainScreen
import com.example.translator.presentation.view.selectlanguage.SelectLanguageScreen

@Composable
internal fun AppNavGraph(
    navHostController: NavHostController,
    navigationState: NavigationState,

    ) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Main.route
    ) {

        composable(Screen.Main.route) {
            MainScreen {
                navHostController.navigate(Screen.SelectLanguage.route)
                //navigationState.navigateTo(Screen.SelectLanguage.route)
            }
        }

        composable(Screen.SelectLanguage.route) {
            SelectLanguageScreen()
        }
    }

}