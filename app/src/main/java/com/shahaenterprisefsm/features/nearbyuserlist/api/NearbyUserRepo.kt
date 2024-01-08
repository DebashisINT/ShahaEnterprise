package com.shahaenterprisefsm.features.nearbyuserlist.api

import com.shahaenterprisefsm.app.Pref
import com.shahaenterprisefsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.shahaenterprisefsm.features.newcollection.model.NewCollectionListResponseModel
import com.shahaenterprisefsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}