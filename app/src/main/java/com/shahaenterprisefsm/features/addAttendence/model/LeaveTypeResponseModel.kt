package com.shahaenterprisefsm.features.addAttendence.model

import com.shahaenterprisefsm.base.BaseResponse

/**
 * Created by Saikat on 22-11-2018.
 */
class LeaveTypeResponseModel : BaseResponse() {
    var leave_type_list: ArrayList<LeaveTypeDataModel>? = null
}