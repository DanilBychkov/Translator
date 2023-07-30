package com.example.translator.presentation.view.main.cell

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/**
 * Ячейка с выбором языка оригинала и языка перевода
 *
 * @param originalLanguage Язык оригинала
 * @param translationLanguage Язык перевода
 * @param onOriginalLanguageClick Клик на "Язык оригинала"
 * @param onTranslationLanguageClick Клик на "Язык перевода"
 * @param modifier Модифаер
 */
@Composable
internal fun SelectLanguageCell(
    originalLanguage: String,
    translationLanguage: String,
    onOriginalLanguageClick: () -> Unit,
    onTranslationLanguageClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier.fillMaxWidth()) {
        TextButton(onClick = onOriginalLanguageClick) {
            Text(text = originalLanguage)
        }

        Spacer(modifier = Modifier.weight(1f))
        TextButton(onClick = onTranslationLanguageClick) {
            Text(text = translationLanguage)
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun SelectLanguageCellPreview() {
    SelectLanguageCell(
        originalLanguage = "Русский",
        translationLanguage = "Английский",
        onOriginalLanguageClick = {},
        onTranslationLanguageClick = {}
    )
}

