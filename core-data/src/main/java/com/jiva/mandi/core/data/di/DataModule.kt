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

    /**
     * Inject interface instances with @Binds
     *
     * The @Binds annotation tells Hilt which implementation to use when it needs to provide an instance of an interface.
     *
     * The annotated function provides the following information to Hilt:
     * The function return type tells Hilt what interface the function provides instances of.
     * The function parameter tells Hilt which implementation to provide.
     * https://developer.android.com/training/dependency-injection/hilt-android#inject-interfaces
     */
    @Binds
    fun bindsNewsResourceRepository(
        newsRepository: OfflineFirstNewsRepository
    ): NewsRepository

}



