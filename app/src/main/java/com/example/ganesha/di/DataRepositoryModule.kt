package com.example.ganesha.di

import com.example.ganesha.data.DataRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DataRepositoryModule {
    @Provides
    fun provideDataRepository(): DataRepository {
        return DataRepository()
    }
}