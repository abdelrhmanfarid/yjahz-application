package com.farid.yjahzapplication.di

import android.content.Context
import android.content.SharedPreferences
import com.farid.yjahzapplication.data.local.prefrences.PreferencesManager
import com.farid.yjahzapplication.utils.constant.AppConst
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {



    @Singleton
    @Provides
    fun getPreferencesManager(sharedPreferences: SharedPreferences): PreferencesManager {
        return PreferencesManager(sharedPreferences)
    }

    @Singleton
    @Provides
    fun getSharedPreferences(@ApplicationContext context: Context): SharedPreferences {
        return context.getSharedPreferences(AppConst.PREFERENCE_NAME, Context.MODE_PRIVATE)
    }

}