package com.ua.pavliyk.application.organise

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.ua.pavliyk.application.ui.root.AppScaffold
import com.ua.pavliyk.application.ui.theme.AppTheme
import com.ua.pavliyk.application.organise.di.initKoin

fun main() = application {
    initKoin { printLogger() }
    Window(
        onCloseRequest = ::exitApplication,
        title = "Organise",
    ) {
        AppTheme {
            AppScaffold()
        }
    }
}