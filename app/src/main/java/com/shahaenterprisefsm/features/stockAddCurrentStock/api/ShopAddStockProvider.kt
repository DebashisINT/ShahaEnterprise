package com.shahaenterprisefsm.features.stockAddCurrentStock.api

import com.shahaenterprisefsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.shahaenterprisefsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}