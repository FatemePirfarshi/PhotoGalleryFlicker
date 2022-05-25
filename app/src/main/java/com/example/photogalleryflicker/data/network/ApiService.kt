package com.example.photogalleryflicker.data.network

import com.example.photogalleryflicker.model.GalleryItemResponse
import retrofit2.http.GET
import retrofit2.http.QueryMap


interface ApiService {

    @GET(".")
    suspend fun getGalleryItems(
        @QueryMap options: Map<String, String>
    ): GalleryItemResponse

}