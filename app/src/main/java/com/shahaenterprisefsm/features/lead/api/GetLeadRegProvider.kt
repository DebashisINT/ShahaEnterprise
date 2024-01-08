package com.shahaenterprisefsm.features.lead.api

import com.shahaenterprisefsm.features.NewQuotation.api.GetQuotListRegRepository
import com.shahaenterprisefsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}