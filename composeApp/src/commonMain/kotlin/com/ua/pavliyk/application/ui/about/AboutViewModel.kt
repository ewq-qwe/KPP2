package com.ua.pavliyk.application.ui.about

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.ua.pavliyk.application.organise.data.about.AboutRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class AboutViewModel(
    private val repository: AboutRepository
) : ViewModel() {

    private val _state = MutableStateFlow<List<Pair<String, String>>>(emptyList())
    val state: StateFlow<List<Pair<String, String>>> = _state.asStateFlow()

    init {
        loadData()
    }

    private fun loadData() {
        viewModelScope.launch {
            _state.value = repository.getAboutItems()
        }
    }
}

val aboutViewModelFactory = viewModelFactory {
    initializer {
        AboutViewModel(AboutRepository())
    }
}