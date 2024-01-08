package com.shahaenterprisefsm.features.login.model.productlistmodel

import com.shahaenterprisefsm.app.domain.ModelEntity
import com.shahaenterprisefsm.app.domain.ProductListEntity
import com.shahaenterprisefsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}