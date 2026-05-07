package com.ua.pavliyk.application

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform