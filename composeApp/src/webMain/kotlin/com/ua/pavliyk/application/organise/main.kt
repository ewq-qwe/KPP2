package com.ua.pavliyk.application.organise

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.ua.pavliyk.application.ui.root.AppScaffold
import com.ua.pavliyk.application.ui.theme.AppTheme
import com.ua.pavliyk.application.organise.di.initKoin

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    initKoin { printLogger() }
    ComposeViewport {
        AppTheme {
            AppScaffold()
        }
    }
}