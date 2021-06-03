package com.mino.cleancoroutineshiltsample.usecase

import com.mino.domain.dto.ImageDto
import com.mino.domain.repository.ImageRepository
import com.mino.domain.usecase.GetImageUseCase
import javax.inject.Inject

class GetImageUseCaseImpl
@Inject
constructor(private val imageRepository: ImageRepository) : GetImageUseCase {

    override suspend fun execute(
        query: String,
        display: Int,
        start: Int,
        sort: String,
        filter: String
    ): List<ImageDto> = imageRepository.getImage(query, display, start, sort, filter)
}