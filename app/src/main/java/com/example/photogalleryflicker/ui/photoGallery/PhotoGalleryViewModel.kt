package com.example.photogalleryflicker.ui.photoGallery

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.photogalleryflicker.domain.Container
import com.example.photogalleryflicker.model.GalleryItemResponse
import kotlinx.coroutines.launch

class PhotoGalleryViewModel : ViewModel() {

    val mPopularItemsLiveData = MutableLiveData<List<GalleryItemResponse.Photos.Photo>>()

    init {
        getPopularItems()
    }

    fun getPopularItems() {

        viewModelScope.launch {
            val list = Container.PhotoRepository.getPopularItems()
            mPopularItemsLiveData.value = list.photos.photo
        }
    }

}