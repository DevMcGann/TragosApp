package com.g.tragosapp.data.remote

import com.g.tragosapp.data.model.CocktailList
import retrofit2.http.GET
import retrofit2.http.Query

interface WebService {
    @GET("search.php")
    suspend fun getCocktailByName(@Query(value = "s") tragoName: String): CocktailList?
}