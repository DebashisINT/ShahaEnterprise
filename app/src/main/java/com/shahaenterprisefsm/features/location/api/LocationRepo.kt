package com.shahaenterprisefsm.features.location.api

import com.shahaenterprisefsm.app.Pref
import com.shahaenterprisefsm.base.BaseResponse
import com.shahaenterprisefsm.features.location.model.AppInfoInputModel
import com.shahaenterprisefsm.features.location.model.AppInfoResponseModel
import com.shahaenterprisefsm.features.location.model.GpsNetInputModel
import com.shahaenterprisefsm.features.location.model.ShopDurationRequest
import com.shahaenterprisefsm.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }

    fun gpsNetInfo(appInfo: GpsNetInputModel?): Observable<BaseResponse> {
        return apiService.submitGpsNetInfo(appInfo)
    }
}