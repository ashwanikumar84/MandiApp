package com.jiva.mandi.core.network.di

import android.content.Context
import com.jiva.mandi.core.network.fake.FakeAssetManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import javax.inject.Singleton

/**
 * Object:
 * A class describes structures that can be instantiated as and when desired and allows for as many
 * instances as needed, an object instead represents a single static instance,
 * and can never have any more or any less than this one instance.
 *
 * objects can extend classes and implement interfaces. In doing so, they are effectively singleton instances
 * of parent classes, exactly as expected.
 * This can be very useful for cases where we have a stateless implementation and there’s no need for
 * creating a new instance every time.
 *
 * https://www.baeldung.com/kotlin/objects
 *
 * //@Module
 * // @InstallIn
 * The above keywords indicates that the bindings found within NetworkModule can be injected into ViewModels.
 * It also indicates that NetworkModule will follow the LifeCycle of the ViewModel associated with it.
 * You can see the full list of Component Lifecycles here.
 * */
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {



    @Provides
    @Singleton
    fun providesNetworkJson(): Json = Json {
        ignoreUnknownKeys = true
    }

    /**
     * Inject instances with @Provides
     * interfaces are not the only case where you cannot constructor-inject a type. Constructor injection is also not possible
     * if you don't own the class because it comes from an external library (classes like Retrofit, OkHttpClient, or Room databases),
     * or if instances must be created with the builder pattern.
     *
     */
    @Provides
    @Singleton
    fun providesFakeAssetManager(
        @ApplicationContext context: Context,
    ): FakeAssetManager = FakeAssetManager(context.assets::open)
}