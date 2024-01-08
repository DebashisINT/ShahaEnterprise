package com.shahaenterprisefsm.features.viewAllOrder.interf

import com.shahaenterprisefsm.app.domain.NewOrderProductEntity
import com.shahaenterprisefsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}