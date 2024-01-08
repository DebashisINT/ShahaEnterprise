package com.shahaenterprisefsm.features.location.api

import com.shahaenterprisefsm.features.location.shopdurationapi.ShopDurationApi
import com.shahaenterprisefsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}