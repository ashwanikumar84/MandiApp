package com.jiva.mandi.core.network.retrofit

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.jiva.mandi.core.network.JivaNetworkDataSource
import com.jiva.mandi.core.network.model.NetworkNewsResource
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Inject
import javax.inject.Singleton


/**
 * Retrofit API declaration for JIVA Network API
 */
private interface RetrofitJivaNetworkApi {

    @GET(value = "newsresources")
    suspend fun getNewsResources(
        @Query("id") ids: List<String>?,
    ): NetworkResponse<List<NetworkNewsResource>>
}

/**
 * Wrapper for data provided from the [BaseUrl]
 */
@Serializable
private data class NetworkResponse<T>(
    val data: T,
)

/**
 * [Retrofit] backed [JivaNetworkDataSource]
 */
@Singleton
class RetrofitJivaNetwork @Inject constructor(networkJson: Json) : JivaNetworkDataSource {

    private val networkApi = Retrofit.Builder().baseUrl("URL").client(
        OkHttpClient.Builder().addInterceptor(
            // TODO: Decide logging logic
            HttpLoggingInterceptor().apply {
                setLevel(HttpLoggingInterceptor.Level.BODY)
            },
        ).build(),
    ).addConverterFactory(
        @OptIn(ExperimentalSerializationApi::class)
        networkJson.asConverterFactory("application/json".toMediaType()),
    ).build().create(RetrofitJivaNetwork::class.java)

    override suspend fun getNewsResources(ids: List<String>?): List<NetworkNewsResource> {
        return networkApi.getNewsResources(ids = ids)
    }
}