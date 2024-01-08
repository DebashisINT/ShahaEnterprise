package com.shahaenterprisefsm.features.newcollection.model

import com.shahaenterprisefsm.app.domain.CollectionDetailsEntity
import com.shahaenterprisefsm.base.BaseResponse
import com.shahaenterprisefsm.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}