package com.eduardo.recyclerviewmvvm.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.eduardo.recyclerviewmvvm.repository.MoviesRepository

@Suppress("UNCHECKED_CAST")
class MoviesViewModelFactory(
    private val repository: MoviesRepository
): ViewModelProvider.NewInstanceFactory(){

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MoviesViewModel(repository) as T
    }

}