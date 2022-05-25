package com.example.photogalleryflicker.domain

import com.example.photogalleryflicker.data.PhotoRemoteDataSource
import com.example.photogalleryflicker.data.PhotoRepository

object Container {

    private val photoRemoteDataSource = PhotoRemoteDataSource()
    val PhotoRepository = PhotoRepository(photoRemoteDataSource)
}