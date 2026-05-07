package com.ua.pavliyk.application.ui.about

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import com.ua.pavliyk.application.organise.data.about.AboutRepository

// 1. ДОДАНО СЛОВО internal
internal class AboutViewModel(
    private val repository: AboutRepository
) : ViewModel() {

    private val _state = MutableStateFlow<List<Pair<String, String>>>(emptyList())
    val state: StateFlow<List<Pair<String, String>>> = _state

    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch {
            // 2. ЯКЩО getAboutItems() СВІТИТЬСЯ ЧЕРВОНИМ:
            // Затисніть Ctrl і клікніть на AboutRepository.
            // Подивіться, як там називається функція, що повертає список характеристик,
            // і впишіть її назву сюди замість getAboutItems()
            _state.value = repository.getAbout()
        }
    }
}

val aboutViewModelFactory = viewModelFactory {
    initializer {
        AboutViewModel(AboutRepository())
    }
}