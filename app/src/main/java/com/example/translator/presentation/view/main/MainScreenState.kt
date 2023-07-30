package com.example.translator.presentation.view.main

/**
 * State главного экрана
 */
internal interface MainScreenState {

    /** Начальное состояние экрана */
    object Initial : MainScreenState

    /**
     *  Данные загружены
     *
     * @param originalLanguage Язык оригинала
     * @param translationLanguage Язык перевода
     */
    data class Loaded(
        val originalLanguage: String,
        val translationLanguage: String
    ) : MainScreenState

    /**
     * Начальное состояние экрана
     *
     * @param originalLanguage Язык оригинала
     * @param translationLanguage Язык перевода
    data class Initial(
    val originalLanguage:String,
    val translationLanguage:String
    ):MainScreenState
     */
}