package com.example.photogalleryflicker.data

import com.example.photogalleryflicker.data.network.ApiService
import com.example.photogalleryflicker.data.util.NetworkParams
import com.example.photogalleryflicker.model.GalleryItemResponse
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PhotoRemoteDataSource @Inject constructor(private val api: ApiService) {

    suspend fun getPopularPhotos(): GalleryItemResponse {
        return api.getGalleryItems(NetworkParams.getPopularOptions())
    }

}