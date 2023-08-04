package com.example.translator.presentation.navigation


internal sealed class Screen(
    val route: String
) {
    object Main : Screen(ROUTE_MAIN)

    object SelectLanguage : Screen(SELECT_LANGUAGE)

    companion object {

        private const val ROUTE_MAIN = "main"
        private const val SELECT_LANGUAGE = "select_language"
    }
}