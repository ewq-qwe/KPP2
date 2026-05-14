package com.ua.pavliyk.application.organise.di

import org.koin.dsl.module
import org.koin.plugin.module.dsl.single
import org.koin.plugin.module.dsl.viewModel
import com.ua.pavliyk.application.organise.data.about.AboutRepository
import com.ua.pavliyk.application.organise.data.about.Platform
import com.ua.pavliyk.application.ui.about.AboutViewModel

val appModule = module {
    single<Platform>()
    single<AboutRepository>()
    viewModel<AboutViewModel>()
}