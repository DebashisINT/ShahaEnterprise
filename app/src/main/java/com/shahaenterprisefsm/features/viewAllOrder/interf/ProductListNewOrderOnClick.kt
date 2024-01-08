package com.shahaenterprisefsm.features.viewAllOrder.interf

import com.shahaenterprisefsm.app.domain.NewOrderGenderEntity
import com.shahaenterprisefsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}