package com.example.userslist

import android.content.Context
import coil.ImageLoader
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import java.util.concurrent.TimeUnit
import javax.inject.Singleton
import okhttp3.Dispatcher
import okhttp3.OkHttpClient

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideImageLoader(@ApplicationContext context: Context): ImageLoader {
        return ImageLoader.Builder(context)
            .okHttpClient {
                val dispatcher = Dispatcher().apply {
                    maxRequestsPerHost = 20
                }
                OkHttpClient.Builder()
                    .readTimeout(15, TimeUnit.SECONDS)
                    .connectTimeout(15, TimeUnit.SECONDS)
                    .dispatcher(dispatcher)
                    .build()
            }
            .crossfade(true)
            .build()
    }

}
