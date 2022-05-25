package com.example.photogalleryflicker.data

import com.example.photogalleryflicker.data.network.ApiService
import com.example.photogalleryflicker.data.network.NetworkParams
import com.example.photogalleryflicker.data.network.RetrofitInstance
import com.example.photogalleryflicker.model.GalleryItemResponse

class PhotoRemoteDataSource {

    private val api by lazy { RetrofitInstance.retrofit.create(ApiService::class.java) }

    suspend fun getPopularPhotos(): GalleryItemResponse {
        return api.getGalleryItems(NetworkParams.getPopularOptions())
    }
}