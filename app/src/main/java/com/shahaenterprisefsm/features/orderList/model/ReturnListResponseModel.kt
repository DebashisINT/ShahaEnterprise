package com.shahaenterprisefsm.features.orderList.model

import com.shahaenterprisefsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}