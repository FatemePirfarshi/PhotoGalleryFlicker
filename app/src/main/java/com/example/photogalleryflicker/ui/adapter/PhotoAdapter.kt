package com.example.photogalleryflicker.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.photogalleryflicker.R
import com.example.photogalleryflicker.databinding.ItemListPhotoGalleryBinding
import com.example.photogalleryflicker.model.GalleryItemResponse


class PhotoAdapter() :
    ListAdapter<GalleryItemResponse.Photos.Photo, PhotoAdapter.PhotoViewHolder>(PhotoDiffCallback) {

    lateinit var mBinding: ItemListPhotoGalleryBinding

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): PhotoViewHolder {

        mBinding = DataBindingUtil.inflate(
            LayoutInflater.from(viewGroup.context),
            R.layout.item_list_photo_gallery,
            viewGroup,
            false
        )

        return PhotoViewHolder(
            mBinding.root
        )
    }

    override fun onBindViewHolder(photoViewHolder: PhotoViewHolder, position: Int) {
        photoViewHolder.bind(getItem(position), mBinding)
    }

    class PhotoViewHolder(private val view: View) :
        RecyclerView.ViewHolder(view) {

        fun bind(
            galleryItem: GalleryItemResponse.Photos.Photo,
            binding: ItemListPhotoGalleryBinding
        ) {
//            binding.setVariable(BR.imageUrl,galleryItem.urlS)
            binding.imageUrl = galleryItem.urlS
        }

    }

    object PhotoDiffCallback : DiffUtil.ItemCallback<GalleryItemResponse.Photos.Photo>() {

        override fun areItemsTheSame(
            oldItem: GalleryItemResponse.Photos.Photo,
            newItem: GalleryItemResponse.Photos.Photo
        ): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: GalleryItemResponse.Photos.Photo,
            newItem: GalleryItemResponse.Photos.Photo
        ): Boolean {
            return oldItem == newItem
        }

    }

}