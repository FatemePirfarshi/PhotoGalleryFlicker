package com.example.photogalleryflicker.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

//    val logger = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BASIC }
//
//    val client = OkHttpClient.Builder().addInterceptor(logger).build()

    val retrofit = Retrofit.Builder()
        .baseUrl(NetworkParams.BASE_URL)
//        .addConverterFactory(GsonConverterFactory.create(createGson())).client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

}