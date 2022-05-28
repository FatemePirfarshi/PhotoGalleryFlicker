package com.example.photogalleryflicker.data.util

class NetworkParams {
    companion object {
        const val BASE_URL = "https://www.flickr.com/services/rest/"
        const val API_KEY = "a6d0ca81c23f7afaf5aee052543e53f6"
        const val METHOD_POPULAR = "flickr.photos.getPopular"

        fun getBaseOptions(): Map<String, String> {
            val optionsHashMap = HashMap<String, String>()
            optionsHashMap["api_key"] = API_KEY
            optionsHashMap["format"] = "json"
            optionsHashMap["nojsoncallback"] = "1"
            optionsHashMap["extras"] = "url_s"
            optionsHashMap["user_id"] = "34427466731@N01"
            return optionsHashMap
        }

        fun getPopularOptions(): Map<String, String> {
            val popularOptions = HashMap<String, String>()
            popularOptions.putAll(getBaseOptions())
            popularOptions["method"] = METHOD_POPULAR
            return popularOptions
        }
    }
}