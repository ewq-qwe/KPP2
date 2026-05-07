package com.ua.pavliyk.application

class JsPlatform : Platform {
    override val name: String = "Web JS"
}

actual fun getPlatform(): Platform = JsPlatform()