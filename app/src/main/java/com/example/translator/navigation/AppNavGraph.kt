package com.example.translator.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.translator.di.DependencyProvider

@Composable
fun AppNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = DependencyProvider.translatorApi().navigationKey
    ) {
        with(DependencyProvider) {
            translatorApi().registerGraph(this@NavHost, navController)
        }
    }
}