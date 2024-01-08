package com.shahaenterprisefsm.features.viewAllOrder.orderOptimized

import com.shahaenterprisefsm.app.domain.ProductOnlineRateTempEntity
import com.shahaenterprisefsm.base.BaseResponse
import com.shahaenterprisefsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}