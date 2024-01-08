package com.shahaenterprisefsm.features.viewAllOrder.interf

import com.shahaenterprisefsm.app.domain.NewOrderGenderEntity
import com.shahaenterprisefsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}