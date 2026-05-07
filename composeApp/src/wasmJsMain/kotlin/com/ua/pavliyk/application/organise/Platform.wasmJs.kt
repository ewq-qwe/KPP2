package com.ua.pavliyk.application

class WasmPlatform : Platform {
    override val name: String = "Web (WebAssembly)"
}

// Виконання "обіцянки" (actual) для платформи Wasm
actual fun getPlatform(): Platform = WasmPlatform()