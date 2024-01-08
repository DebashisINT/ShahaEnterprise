package com.shahaenterprisefsm.features.viewAllOrder.api.addorder

import com.shahaenterprisefsm.features.timesheet.api.TimeSheetApi
import com.shahaenterprisefsm.features.timesheet.api.TimeSheetRepo

/**
 * Created by Saikat on 01-10-2018.
 */
object AddOrderRepoProvider {
    fun provideAddOrderRepository(): AddOrderRepo {
        return AddOrderRepo(AddOrderApi.create())
    }

    fun provideAddOrderImageRepository(): AddOrderRepo {
        return AddOrderRepo(AddOrderApi.createImage())
    }
}