package com.example.translator.presentation.view.selectlanguage

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

internal class SelectLanguageViewModel(savedStateHandle: SavedStateHandle) : ViewModel() {

    private val language: String = checkNotNull(savedStateHandle["//Todo"])
    
}