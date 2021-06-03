package com.mino.cleancoroutineshiltsample.di

import com.mino.data.repository.ImageRepositoryImpl
import com.mino.domain.repository.ImageRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindImageRepository(impl: ImageRepositoryImpl): ImageRepository
}