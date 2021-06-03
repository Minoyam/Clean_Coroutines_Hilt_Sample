package com.mino.data.source

import com.mino.data.response.ImageResponse

interface ImageRemoteDataSource {

    suspend fun getImage(
        query: String,
        display: Int,
        start: Int,
        sort: String,
        filter: String
    ) : ImageResponse
}