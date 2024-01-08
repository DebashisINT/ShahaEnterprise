package com.shahaenterprisefsm.features.stockCompetetorStock.api

import com.shahaenterprisefsm.base.BaseResponse
import com.shahaenterprisefsm.features.orderList.model.NewOrderListResponseModel
import com.shahaenterprisefsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.shahaenterprisefsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}