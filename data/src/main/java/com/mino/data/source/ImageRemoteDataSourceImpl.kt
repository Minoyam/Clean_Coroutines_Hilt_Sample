package com.mino.data.source

import com.mino.data.network.ImageApi
import com.mino.data.response.ImageResponse
import javax.inject.Inject

class ImageRemoteDataSourceImpl
@Inject
constructor(private val imageApi: ImageApi) : ImageRemoteDataSource {
    override suspend fun getImage(
        query: String,
        display: Int,
        start: Int,
        sort: String,
        filter: String
    ): ImageResponse = imageApi.getImage(query, display, start, sort, filter)
}