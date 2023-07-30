package com.example.translator.presentation.view.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.translator.presentation.view.main.cell.SelectLanguageCell

/**
 * Composable функция главного экрана
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun MainScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Hello")
                }
            )
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            SelectLanguageCell(
                originalLanguage = "Русский",
                translationLanguage = "Английский",
                onOriginalLanguageClick = {},
                onTranslationLanguageClick = {}
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun MainScreenPreview() {
    MainScreen()
}