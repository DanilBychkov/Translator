package com.example.translator.presentation.view.selectlanguage

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/**
 * Composable функция выбора языка
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SelectLanguageScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Hello Select Language")
                }
            )
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            Text(text = "Hello")
        }
    }
}


@Preview
@Composable
private fun SelectLanguageScreenPreview() {
    //SelectLanguageScreen()
}