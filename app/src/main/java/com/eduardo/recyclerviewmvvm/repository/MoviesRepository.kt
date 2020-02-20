package com.eduardo.recyclerviewmvvm.repository

import com.eduardo.recyclerviewmvvm.service.MoviesApi

class MoviesRepository(
    private val api: MoviesApi
) : SafeApiRequest() {

    suspend fun getMovies() = apiRequest { api.getMovies() }

}