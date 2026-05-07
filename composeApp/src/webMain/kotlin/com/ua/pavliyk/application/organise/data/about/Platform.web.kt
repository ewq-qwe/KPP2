/*package com.ua.pavliyk.application.organise.data.about

import co.touchlab.kermit.Logger
import kotlinx.browser.window
import com.ua.pavliyk.application.organise.parseBrowserName
import com.ua.pavliyk.application.organise.parseBrowserVersion
import com.ua.pavliyk.application.organise.parseLayoutEngine
import com.ua.pavliyk.application.organise.parseOsName
import com.ua.pavliyk.application.organise.parseOsVersion

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class Platform actual constructor() {
    actual val osName: String
        get() = parseBrowserName(window.navigator.userAgent)
    actual val osVersion: String
        get() = parseBrowserVersion(window.navigator.userAgent)
    actual val deviceModel: String
        get() = parseOsName(window.navigator.userAgent) + " " + parseOsVersion(window.navigator.userAgent)
    actual val cpuType: String
        get() = parseLayoutEngine(window.navigator.userAgent)
    actual val screen: ScreenInfo
        get() = ScreenInfo()

    @Suppress("unused") // Приховує попередження про невикористану функцію
    actual fun logSystemInfo() {
        Logger.d("Platform $deviceModel") // Припускаю, що ви мали на увазі deviceModel, оскільки deviceInfo тут не визначено
    }
}

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class ScreenInfo actual constructor() {
    // Явне визначення типів виправляє попередження "unchecked nullability"
    val pageWidth: Int = window.innerWidth
    val pageHeight: Int = window.innerHeight
    val deviceDensity: Double = window.devicePixelRatio

    actual val width: Int
        get() = pageWidth
    actual val height: Int
        get() = pageHeight
    actual val density: Int?
        get() = deviceDensity.toInt()
}*/