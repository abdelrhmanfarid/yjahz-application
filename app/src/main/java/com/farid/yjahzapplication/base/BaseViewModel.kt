package com.farid.yjahzapplication.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.farid.yjahzapplication.R
import com.farid.yjahzapplication.YjahzApplication
import com.farid.yjahzapplication.data.model.responseModels.BaseResponseModel
import okhttp3.RequestBody


abstract class BaseViewModel : ViewModel() {



    private var errorDialog: MutableLiveData<String> = MutableLiveData()
    private var successDialog: MutableLiveData<String> = MutableLiveData()
    var params = mutableMapOf<String, Any>()
    var paramsGet = mutableMapOf<String, String >()
    var headerParams = mutableMapOf<String , Any>()
    var partMap = mutableMapOf<String , RequestBody>()

    abstract fun stop()
    abstract fun start()



    var networkStatus = false



    fun showSuccessMessage(baseModel: BaseResponseModel){

            successDialog.value = baseModel.message

    }


//    fun showServerMessageException(){
//        if (networkStatus){
//            errorDialog.value = YjahzApplication.instance.getString(R.string.server_error)
//        }else{
//            errorDialog.value = YjahzApplication.instance.getString(R.string.no_network)
//        }
//    }
//
//    fun showServerMessageExceptionNew(message : String){
//        if (networkStatus){
//            errorDialog.value = message
//        }else{
//            errorDialog.value = YjahzApplication.instance.getString(R.string.no_network)
//        }
//    }





































}