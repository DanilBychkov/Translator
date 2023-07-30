package com.example.translator.presentation.view.main

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

internal class MainScreenViewModel() : ViewModel() {

    private val _state = MutableStateFlow(MainScreenState.Initial)
    val state = _state.asStateFlow()

}