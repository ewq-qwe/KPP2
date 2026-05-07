package com.ua.pavliyk.application

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.ua.pavliyk.application.ui.root.AppScaffold

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Organise",
    ) {
        AppScaffold()
    }
}