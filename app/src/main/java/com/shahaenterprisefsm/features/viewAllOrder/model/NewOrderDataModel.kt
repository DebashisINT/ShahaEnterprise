package com.shahaenterprisefsm.features.viewAllOrder.model

import com.shahaenterprisefsm.app.domain.NewOrderColorEntity
import com.shahaenterprisefsm.app.domain.NewOrderGenderEntity
import com.shahaenterprisefsm.app.domain.NewOrderProductEntity
import com.shahaenterprisefsm.app.domain.NewOrderSizeEntity
import com.shahaenterprisefsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

