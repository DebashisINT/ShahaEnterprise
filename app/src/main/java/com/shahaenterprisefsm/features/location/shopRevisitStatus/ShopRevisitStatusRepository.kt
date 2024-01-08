package com.shahaenterprisefsm.features.location.shopRevisitStatus

import com.shahaenterprisefsm.base.BaseResponse
import com.shahaenterprisefsm.features.location.model.ShopDurationRequest
import com.shahaenterprisefsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}