package com.mino.domain.repository

import com.mino.domain.dto.ImageDto

interface ImageRepository {

    suspend fun getImage(
        query: String,
        display: Int,
        start: Int,
        sort: String,
        filter: String
    ) : List<ImageDto>
}