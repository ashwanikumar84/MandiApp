package com.jiva.mandi.core.data.repository.fake

import com.jiva.mandi.core.data.Synchronizer
import com.jiva.mandi.core.data.model.NewsResource
import com.jiva.mandi.core.data.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

/**
 * Fake implementation of the [NewsRepository] that retrieves the news resources from a JSON String.
 *
 * This allows us to run the app with fake data, without needing an internet connection or working
 * backend.
 */
class FakeNewsRepository : NewsRepository {


    override fun getNewsResources(): Flow<List<NewsResource>> {
        TODO("Not yet implemented")
    }

    override suspend fun syncWith(synchronizer: Synchronizer): Boolean {
        TODO("Not yet implemented")
    }
}