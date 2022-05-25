package com.example.photogalleryflicker.ui.photoGallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.photogalleryflicker.R
import com.example.photogalleryflicker.databinding.FragmentPhotoGalleryBinding
import com.example.photogalleryflicker.ui.adapter.PhotoAdapter


class PhotoGalleryFragment : Fragment() {

    private val mViewModel: PhotoGalleryViewModel by viewModels()
    lateinit var mBinding: FragmentPhotoGalleryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mBinding =
            DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_photo_gallery,
                container,
                false
            )
        mBinding.viewModel = mViewModel
        mBinding.lifecycleOwner = this.viewLifecycleOwner

        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        var photoAdapter = PhotoAdapter()
        mBinding.rvPhotoGallery.adapter = photoAdapter
        mViewModel.mPopularItemsLiveData.observe(viewLifecycleOwner) {
            photoAdapter.submitList(it)
        }
    }

}