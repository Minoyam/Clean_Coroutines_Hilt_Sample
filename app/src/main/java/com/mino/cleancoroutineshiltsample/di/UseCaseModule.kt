package com.mino.cleancoroutineshiltsample.di

import com.mino.cleancoroutineshiltsample.usecase.GetImageUseCaseImpl
import com.mino.domain.usecase.GetImageUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(ViewModelComponent::class)
@Module
abstract class UseCaseModule {

    @ViewModelScoped
    @Binds
    abstract fun bindGetImageUsecase(impl : GetImageUseCaseImpl) : GetImageUseCase
}