package com.shahaenterprisefsm.features.weather.api

import com.shahaenterprisefsm.base.BaseResponse
import com.shahaenterprisefsm.features.task.api.TaskApi
import com.shahaenterprisefsm.features.task.model.AddTaskInputModel
import com.shahaenterprisefsm.features.weather.model.ForeCastAPIResponse
import com.shahaenterprisefsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}