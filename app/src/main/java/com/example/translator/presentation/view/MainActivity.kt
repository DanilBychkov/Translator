package com.example.translator.presentation.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.translator.presentation.navigation.AppNavGraph
import com.example.translator.presentation.navigation.rememberNavigationState
import com.example.translator.ui.theme.TranslatorTheme

internal class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TranslatorTheme {
                val navHostController = rememberNavController()
                val navigationState = rememberNavigationState()
                AppNavGraph(
                    navHostController = navHostController,
                    navigationState = navigationState
                )
            }
        }
    }
}