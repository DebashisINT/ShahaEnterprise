package com.shahaenterprisefsm.features.newcollectionreport

import com.shahaenterprisefsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}