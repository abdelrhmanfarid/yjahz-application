package com.farid.yjahzapplication.di

import com.farid.yjahzapplication.data.remote.ApiService
import com.farid.yjahzapplication.data.remote.DataRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRepo(apiService: ApiService): DataRepository {
        return DataRepository(apiService)
    }
}