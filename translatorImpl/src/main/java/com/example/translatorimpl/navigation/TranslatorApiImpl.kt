package com.example.translatorimpl.navigation

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.translatorapi.navigation.TranslatorApi
import com.example.translatorimpl.presentation.view.main.MainScreen
import com.example.translatorimpl.presentation.view.selectlanguage.SelectLanguageScreen

//TODO: Разделить ответственность у классов, дописать навигацию
class TranslatorApiImpl : TranslatorApi {

    override val navigationKey: String = "Translator"

    override fun navigateToMainScreen(navController: NavController) {
        navController.navigate("translator/main")
    }

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavController,
        modifier: Modifier
    ) {
        navGraphBuilder.navigation(
            route = navigationKey,
            startDestination = "translator/main"
        ) {
            composable(route = "translator/main") {
                MainScreen(modifier)
            }

            composable(route = "translator/selectLanguage") {
                SelectLanguageScreen(modifier)
            }
        }
    }
}