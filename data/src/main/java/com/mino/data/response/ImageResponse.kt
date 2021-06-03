package com.mino.data.response


import com.google.gson.annotations.SerializedName
import com.mino.domain.dto.ImageDto

data class ImageResponse(
    @SerializedName("display")
    val display: Int,
    @SerializedName("items")
    val items: List<Item>,
    @SerializedName("lastBuildDate")
    val lastBuildDate: String,
    @SerializedName("start")
    val start: Int,
    @SerializedName("total")
    val total: Int
) {
    data class Item(
        @SerializedName("link")
        val link: String,
        @SerializedName("sizeheight")
        val sizeheight: String,
        @SerializedName("sizewidth")
        val sizewidth: String,
        @SerializedName("thumbnail")
        val thumbnail: String,
        @SerializedName("title")
        val title: String
    ) {
        fun toDomain(): ImageDto =
            ImageDto(
                link = link,
                sizeheight = sizeheight,
                sizewidth = sizewidth,
                thumbnail = thumbnail,
                title = title
            )
    }
}