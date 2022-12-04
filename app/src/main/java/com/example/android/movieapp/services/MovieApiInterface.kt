package com.example.android.movieapp.services

import com.example.android.movieapp.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/tv/top_rated")
    fun getMovieList(): Call<MovieResponse>
}
