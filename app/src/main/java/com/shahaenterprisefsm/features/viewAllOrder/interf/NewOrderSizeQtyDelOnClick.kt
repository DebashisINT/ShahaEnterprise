package com.shahaenterprisefsm.features.viewAllOrder.interf

import com.shahaenterprisefsm.app.domain.NewOrderGenderEntity
import com.shahaenterprisefsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}