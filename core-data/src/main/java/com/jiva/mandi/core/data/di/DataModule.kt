package com.jiva.mandi.core.data.di

import com.jiva.mandi.core.data.repository.NewsRepository
import com.jiva.mandi.core.data.repository.OfflineFirstNewsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module // Like a Dagger module, it informs Hilt how to provide instances of certain types
@InstallIn(SingletonComponent::class) // you must annotate Hilt modules with @InstallIn to tell Hilt which Android class each module will be used or installed in.
interface DataModule {

    @Binds
    fun bindsNewsResourceRepository(
        newsRepository: OfflineFirstNewsRepository
    ): NewsRepository

}



