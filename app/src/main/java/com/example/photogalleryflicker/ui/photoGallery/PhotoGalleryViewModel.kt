package com.example.photogalleryflicker.ui.photoGallery

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.photogalleryflicker.data.PhotoRepository
import com.example.photogalleryflicker.model.GalleryItemResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PhotoGalleryViewModel @Inject constructor(private val photoRepository: PhotoRepository) :
    ViewModel() {

    val mPopularItemsLiveData = MutableLiveData<List<GalleryItemResponse.Photos.Photo>>()

    init {
        getPopularItems()
    }

    fun getPopularItems() {

        viewModelScope.launch {
            val list = photoRepository.getPopularItems()
            mPopularItemsLiveData.value = list.photos.photo
        }
    }

}