package com.example.baseapplication.data.remote.api


import retrofit2.Response
import retrofit2.http.*


interface Api {
    @FormUrlEncoded
    @POST("end point")
    suspend fun getVehicles(
        @Field("sampleField") sampleField: Int,
    ): Response<List<String>>
}