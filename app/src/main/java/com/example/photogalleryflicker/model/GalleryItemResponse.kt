package com.example.photogalleryflicker.model


import com.google.gson.annotations.SerializedName

data class GalleryItemResponse(
    @SerializedName("photos")
    val photos: Photos,
    @SerializedName("stat")
    val stat: String
) {
    data class Photos(
        @SerializedName("page")
        val page: Int,
        @SerializedName("pages")
        val pages: Int,
        @SerializedName("perpage")
        val perpage: Int,
        @SerializedName("photo")
        val photo: List<Photo>,
        @SerializedName("total")
        val total: Int
    ) {
        data class Photo(
            @SerializedName("farm")
            val farm: Int,
            @SerializedName("height_s")
            val heightS: Int,
            @SerializedName("id")
            val id: String,
            @SerializedName("isfamily")
            val isfamily: Int,
            @SerializedName("isfriend")
            val isfriend: Int,
            @SerializedName("ispublic")
            val ispublic: Int,
            @SerializedName("owner")
            val owner: String,
            @SerializedName("secret")
            val secret: String,
            @SerializedName("server")
            val server: String,
            @SerializedName("title")
            val title: String,
            @SerializedName("url_s")
            val urlS: String,
            @SerializedName("width_s")
            val widthS: Int
        )
    }
}