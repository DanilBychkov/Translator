package com.example.translator.presentation.view.selectlanguage.navigation

import androidx.navigation.NavController
import com.example.translator.presentation.navigation.Screen


fun NavController.navigateToSelectLanguageScreen(language: String) {
    this.navigate("${Screen.SelectLanguage.route}/$language")
}