package com.example.baseapplication.di

import com.example.baseapplication.data.remote.api.Api
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {


    @Singleton
    @Provides
    fun provideLogger() : HttpLoggingInterceptor {
        return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    @Singleton
    @Provides
    fun provideOkhttpClientBuilder(logger : HttpLoggingInterceptor) : OkHttpClient.Builder {
        return OkHttpClient.Builder().addInterceptor(logger)
    }

    @Singleton
    @Provides
    fun provideGsonBuilder(): Gson {
        return GsonBuilder()
            .excludeFieldsWithoutExposeAnnotation()
            .create()
    }

    @Singleton
    @Provides
    fun provideRetrofitBuilder(gson:  Gson , okHttpClientBuilder: OkHttpClient.Builder ): Retrofit.Builder {
        return Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(okHttpClientBuilder.build())
    }

    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit.Builder): Api {
        return retrofit
            .build()
            .create(Api::class.java)
    }

}