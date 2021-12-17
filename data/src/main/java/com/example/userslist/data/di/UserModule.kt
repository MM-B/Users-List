package com.example.userslist.data.di

import com.example.userslist.data.api.UserApiService
import com.example.userslist.data.datesources.UserRemoteDataSource
import com.example.userslist.data.datesources.UserRemoteDataSourceImpl
import com.example.userslist.data.repositories.UserRepositoryRepositoryImpl
import com.example.userslist.domain.repositories.UserRepositoryRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
abstract class UserModule {

    @Binds
    @Singleton
    abstract fun bindsUserRemoteDataSource(impl: UserRemoteDataSourceImpl): UserRemoteDataSource

    @Binds
    @Singleton
    abstract fun bindsUserRepository(impl: UserRepositoryRepositoryImpl): UserRepositoryRepository

    companion object {
        @Provides
        fun provideApiService(retrofit: Retrofit): UserApiService {
            return retrofit.create(UserApiService::class.java)
        }
    }
}