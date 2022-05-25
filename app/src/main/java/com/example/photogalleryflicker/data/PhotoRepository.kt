package com.example.photogalleryflicker.data

import com.example.photogalleryflicker.model.GalleryItemResponse

class PhotoRepository(val remoteDataSource: PhotoRemoteDataSource) {

    suspend fun getPopularItems(): GalleryItemResponse {
        return remoteDataSource.getPopularPhotos()
    }
}