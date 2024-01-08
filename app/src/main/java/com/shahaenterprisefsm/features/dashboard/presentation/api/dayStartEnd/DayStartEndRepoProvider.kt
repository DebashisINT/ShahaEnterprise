package com.shahaenterprisefsm.features.dashboard.presentation.api.dayStartEnd

import com.shahaenterprisefsm.features.stockCompetetorStock.api.AddCompStockApi
import com.shahaenterprisefsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}