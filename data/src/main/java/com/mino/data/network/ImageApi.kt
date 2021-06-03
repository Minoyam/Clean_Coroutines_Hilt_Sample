package com.mino.data.network

import com.mino.data.response.ImageResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ImageApi {

    @GET("/v1/search/image")
    suspend fun getImage(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int,
        @Query("sort") sort: String,
        @Query("filter") filter: String
    ): ImageResponse


    companion object {
        const val BASE_URL = "https://openapi.naver.com"
        const val CLIENT_ID = "w5evdYFDse2rDhYmP3Tl"
        const val CLIENT_SECRET = "ArWxVJHzes"
    }
}