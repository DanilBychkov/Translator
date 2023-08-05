package com.example.featureapi

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder

interface FeatureApi {

    //TODO  Подумать, как убрать ключ
    val navigationKey: String

    fun navigateToMainScreen(navController: NavController)

    fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavController,
        modifier: Modifier = Modifier
    )
}