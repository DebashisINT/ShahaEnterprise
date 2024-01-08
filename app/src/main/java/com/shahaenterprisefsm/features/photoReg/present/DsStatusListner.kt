package com.shahaenterprisefsm.features.photoReg.present

import com.shahaenterprisefsm.app.domain.ProspectEntity
import com.shahaenterprisefsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}