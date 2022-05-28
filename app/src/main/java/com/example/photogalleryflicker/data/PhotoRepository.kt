package com.example.photogalleryflicker.data

import com.example.photogalleryflicker.model.GalleryItemResponse
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class PhotoRepository @Inject constructor(private val remoteDataSource: PhotoRemoteDataSource) {

    suspend fun getPopularItems(): GalleryItemResponse {
        return remoteDataSource.getPopularPhotos()
    }
}