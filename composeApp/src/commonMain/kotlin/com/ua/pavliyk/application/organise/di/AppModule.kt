package com.ua.pavliyk.application.organise.di

import com.russhwolf.settings.ObservableSettings
import com.russhwolf.settings.Settings
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module
import org.koin.plugin.module.dsl.create
import org.koin.plugin.module.dsl.single
import org.koin.plugin.module.dsl.viewModel
import com.ua.pavliyk.application.organise.data.common.preferences.AppPreferences
import com.ua.pavliyk.application.organise.data.common.preferences.Preferences
import com.ua.pavliyk.application.organise.data.about.AboutRepository
import com.ua.pavliyk.application.organise.data.about.Platform
import com.ua.pavliyk.application.ui.about.AboutViewModel

private fun createSettings() : Settings = Settings()
val dataModule = module {
    single { create(::createSettings) } binds arrayOf(Settings::class, ObservableSettings::class)
    singleOf(::AppPreferences) bind Preferences::class
}
val appModule = module {
    includes(dataModule)
    single<Platform>()
    single<AboutRepository>()
    viewModel<AboutViewModel>()
}