package com.example.translator.di

import com.example.translatorapi.navigation.TranslatorApi
import com.example.translatorimpl.navigation.TranslatorApiImpl

internal object DependencyProvider {

    fun translatorApi(): TranslatorApi {
        return TranslatorApiImpl()
    }
}