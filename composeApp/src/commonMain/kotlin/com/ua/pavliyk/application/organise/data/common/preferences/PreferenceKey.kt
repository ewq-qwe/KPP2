package com.ua.pavliyk.application.organise.data.common.preferences

enum class PreferenceKey {
    ABOUT_VISITED_COUNT,
    ABOUT_VISITED_DATE;

    val key get() = this.name
}