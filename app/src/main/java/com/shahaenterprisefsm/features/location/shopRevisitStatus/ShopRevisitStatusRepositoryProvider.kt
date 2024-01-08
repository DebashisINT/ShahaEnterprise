package com.shahaenterprisefsm.features.location.shopRevisitStatus

import com.shahaenterprisefsm.features.location.shopdurationapi.ShopDurationApi
import com.shahaenterprisefsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}