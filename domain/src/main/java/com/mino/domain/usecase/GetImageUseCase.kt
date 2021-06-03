package com.mino.domain.usecase

import com.mino.domain.dto.ImageDto

interface GetImageUseCase {
    suspend fun execute(
        query: String,
        display: Int,
        start: Int,
        sort: String,
        filter: String
    ): List<ImageDto>
}