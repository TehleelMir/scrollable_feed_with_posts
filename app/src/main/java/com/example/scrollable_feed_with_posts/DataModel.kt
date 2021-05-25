package com.example.scrollable_feed_with_posts
import java.io.Serializable

data class DataModel(
        var name: String,
        var userName: String,
        var caption: String? = null,
        var avatarImageId: Int,
        var imagePostId: Int? = null,
        var noOfComments: Int?,
        var date: String
) : Serializable