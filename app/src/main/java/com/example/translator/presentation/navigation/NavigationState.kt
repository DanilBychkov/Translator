package com.example.translator.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

internal class NavigationState(
    private val navHostController: NavHostController
) {
    fun navigateTo(route: String) {
        navHostController.navigate(route)
    }
}

@Composable
internal fun rememberNavigationState(
    navHostController: NavHostController = rememberNavController()
): NavigationState {
    return remember {
        NavigationState(navHostController)
    }
}