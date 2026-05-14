package com.ua.pavliyk.application.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import org.jetbrains.compose.resources.Font
import application.composeapp.generated.resources.Res
import application.composeapp.generated.resources.oregano_regular

@Composable
fun AppTypography(): Typography {
    val oreganoFamily = FontFamily(
        Font(Res.font.oregano_regular)
    )

    val baseline = Typography()

    return Typography(
        displayLarge = baseline.displayLarge.copy(fontFamily = oreganoFamily),
        displayMedium = baseline.displayMedium.copy(fontFamily = oreganoFamily),
        displaySmall = baseline.displaySmall.copy(fontFamily = oreganoFamily),
        headlineLarge = baseline.headlineLarge.copy(fontFamily = oreganoFamily),
        headlineMedium = baseline.headlineMedium.copy(fontFamily = oreganoFamily),
        headlineSmall = baseline.headlineSmall.copy(fontFamily = oreganoFamily),
        titleLarge = baseline.titleLarge.copy(fontFamily = oreganoFamily),
        titleMedium = baseline.titleMedium.copy(fontFamily = oreganoFamily),
        titleSmall = baseline.titleSmall.copy(fontFamily = oreganoFamily),
        bodyLarge = baseline.bodyLarge.copy(fontFamily = oreganoFamily),
        bodyMedium = baseline.bodyMedium.copy(fontFamily = oreganoFamily),
        bodySmall = baseline.bodySmall.copy(fontFamily = oreganoFamily),
        labelLarge = baseline.labelLarge.copy(fontFamily = oreganoFamily),
        labelMedium = baseline.labelMedium.copy(fontFamily = oreganoFamily),
        labelSmall = baseline.labelSmall.copy(fontFamily = oreganoFamily),
    )
}