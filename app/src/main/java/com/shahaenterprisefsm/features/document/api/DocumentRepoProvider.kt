package com.shahaenterprisefsm.features.document.api

import com.shahaenterprisefsm.features.dymanicSection.api.DynamicApi
import com.shahaenterprisefsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}