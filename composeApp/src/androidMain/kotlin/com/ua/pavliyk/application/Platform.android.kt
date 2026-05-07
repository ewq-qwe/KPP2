package com.ua.pavliyk.application

import android.os.Build

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

// Ключове слово actual показує, що це виконання обіцянки з commonMain
actual fun getPlatform(): Platform = AndroidPlatform()