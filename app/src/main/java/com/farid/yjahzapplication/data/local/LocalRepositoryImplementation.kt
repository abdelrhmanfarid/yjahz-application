package com.farid.yjahzapplication.data.local

import com.farid.yjahzapplication.data.local.prefrences.PreferencesManager
import com.farid.yjahzapplication.data.model.responseModels.loginResponse.Data
import com.farid.yjahzapplication.data.model.responseModels.signUpResponse.SignUpResponse
import com.farid.yjahzapplication.utils.constant.AppConst
import javax.inject.Inject

class LocalRepositoryImplementation @Inject constructor(

    private val prefManager: PreferencesManager
) : LocalRepository {


    override fun saveUserToken(token: String) = prefManager.saveToken(AppConst.USER_TOKEN,token)
    override fun returnUserToken() = prefManager.returnToken(AppConst.USER_TOKEN)
}