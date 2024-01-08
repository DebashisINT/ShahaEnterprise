package com.shahaenterprisefsm.features.weather.api

import com.shahaenterprisefsm.features.task.api.TaskApi
import com.shahaenterprisefsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}