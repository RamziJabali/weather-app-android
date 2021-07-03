package com.example.androidweatherapp.models

import com.example.androidweatherapp.viewmodel.ViewModel
import retrofit2.Call
import retrofit2.Response

class UseCase(var viewModel: ViewModel) {

    private val repo = WeatherRepo(this)

    fun getWeatherForLocation(whereOnEarthId: Int) {
        repo.getWeatherForLocation(whereOnEarthId)
    }

    fun onResponse(
        call: Call<WeatherForLocation>,
        response: Response<WeatherForLocation>
    ) {
        viewModel.onResponse(call, response)
    }

    fun onFailure(call: Call<WeatherForLocation>, t: Throwable) {
        viewModel.onFailure(call, t)
    }

}