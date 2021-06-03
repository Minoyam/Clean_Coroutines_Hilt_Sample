package com.mino.data.repository

import com.mino.data.source.ImageRemoteDataSource
import com.mino.domain.dto.ImageDto
import com.mino.domain.repository.ImageRepository
import javax.inject.Inject

class ImageRepositoryImpl
@Inject
constructor(private val imageRemoteDataSource: ImageRemoteDataSource) :
    ImageRepository {
    override suspend fun getImage(
        query: String,
        display: Int,
        start: Int,
        sort: String,
        filter: String
    ): List<ImageDto> =
        imageRemoteDataSource.getImage(query, display, start, sort, filter).items.map {
            it.toDomain()
        }
}