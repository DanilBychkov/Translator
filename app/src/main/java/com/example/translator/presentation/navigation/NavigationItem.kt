package com.example.translator.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.translator.R

internal sealed class NavigationItem(
    val screen: Screen, // Возможно стоит добавить аннотацию
    val icon: ImageVector,
    val titleResId: Int? = null,// Возможно стоит добавить аннотацию
) {
    object Main : NavigationItem(
        screen = Screen.Main,
        icon = Icons.Filled.Star,
        titleResId = R.string.translator_title
    )

    object SelectLanguage : NavigationItem(
        screen = Screen.SelectLanguage,
        icon = Icons.Outlined.ArrowBack
    )
}
