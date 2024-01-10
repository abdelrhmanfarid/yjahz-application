package com.farid.yjahzapplication.data.local.prefrences

import android.content.SharedPreferences
import com.google.gson.Gson

class PreferencesManager(private val sharedPreferences: SharedPreferences) {
    private val editor: SharedPreferences.Editor = this.sharedPreferences.edit()

    fun saveToken(key: String , value: String){
        editor.putString(key , value).apply()
    }

    fun returnToken(key: String): String{
        return sharedPreferences.getString(key , "").toString()
    }



    fun <Model> getObject(key: String, modelClass: Class<Model>): Model  {
        val json = this.sharedPreferences.getString(key, null)
        val gson = Gson()
        return gson.fromJson(json, modelClass)
    }

    fun saveObject(key: String, model: Any) {
        editor.putString(key, Gson().toJson(model))
        editor.commit()
    }

    fun clearSharedPreferences() {
        this.sharedPreferences.edit().clear().apply()
    }


}

