package com.jiva.mandi.core.network.fake

import JvmUnitTestFakeAssetManager
import com.jiva.mandi.core.network.Dispatcher
import com.jiva.mandi.core.network.JivaNetworkDataSource
import com.jiva.mandi.core.network.NiaDispatchers.IO
import com.jiva.mandi.core.network.model.NetworkNewsResource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import javax.inject.Inject

/**
 * resposnible ot fetch data from fake json item
 */
class FakeNiaNetworkDataSource @Inject constructor(
    @Dispatcher(IO) private val ioDispatcher: CoroutineDispatcher,
    private val networkJson: Json,
    private val assets: FakeAssetManager = JvmUnitTestFakeAssetManager,
) : JivaNetworkDataSource {

    companion object {
        private const val AUTHORS_ASSET = "authors.json"
        private const val NEWS_ASSET = "news.json"
        private const val TOPICS_ASSET = "topics.json"
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun getNewsResources(ids: List<String>?): List<NetworkNewsResource> {
        return withContext(ioDispatcher) {
            assets.open(NEWS_ASSET).use(networkJson::decodeFromStream)
        }
    }
}