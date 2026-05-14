package com.ua.pavliyk.application.organise.data.about

class AboutRepository {
    fun getAboutItems(): List<Pair<String, String>> {
        val platform = Platform()
        return listOf(
            "Operating System" to "${platform.osName} ${platform.osVersion}",
            "Device" to platform.deviceModel,
            "CPU" to platform.cpuType,
            "Screen Resolution" to "${platform.screen.width} x ${platform.screen.height}",
            "Screen Density" to "${platform.screen.density}"
        )
    }
}