package com.example.android.movieapp.services

import com.example.android.movieapp.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/discover/movie?api_key=ce95b08e552ec8af864fa72d72c63720&language=de-DE&region=DE&release_date.gte=2016-11-16&release_date.lte=2016-12-02&with_release_type=2|3")
    fun getMovieList(): Call<MovieResponse>
}