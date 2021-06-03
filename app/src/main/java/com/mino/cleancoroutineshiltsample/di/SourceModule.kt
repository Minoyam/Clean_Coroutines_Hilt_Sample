package com.mino.cleancoroutineshiltsample.di

import com.mino.data.source.ImageRemoteDataSource
import com.mino.data.source.ImageRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class SourceModule {

    @Singleton
    @Binds
    abstract fun bindImageRemoteDataSource(impl : ImageRemoteDataSourceImpl) : ImageRemoteDataSource
}