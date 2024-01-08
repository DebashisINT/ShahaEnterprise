package com.shahaenterprisefsm.features.viewAllOrder.interf

import com.shahaenterprisefsm.app.domain.NewOrderColorEntity
import com.shahaenterprisefsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}