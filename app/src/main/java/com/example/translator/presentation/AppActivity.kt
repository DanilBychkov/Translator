package com.example.translator.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.translator.navigation.AppNavGraph
import com.example.translator.ui.theme.TranslatorTheme

internal class AppActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //TODO DI
        super.onCreate(savedInstanceState)
        setContent {
            TranslatorTheme {
                val navHostController = rememberNavController()
                AppNavGraph(navController = navHostController)
            }
        }
    }
}