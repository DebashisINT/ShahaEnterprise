package com.shahaenterprisefsm.features.survey.api

import com.shahaenterprisefsm.features.photoReg.api.GetUserListPhotoRegApi
import com.shahaenterprisefsm.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}