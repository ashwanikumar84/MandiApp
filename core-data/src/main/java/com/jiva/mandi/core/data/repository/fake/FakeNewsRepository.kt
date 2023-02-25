package com.jiva.mandi.core.data.repository.fake

import com.jiva.mandi.core.data.Synchronizer
import com.jiva.mandi.core.data.model.asEntity
import com.jiva.mandi.core.data.repository.NewsRepository
import com.jiva.mandi.core.data.repository.NewsResourceQuery
import com.jiva.mandi.core.model.data.NewsResource
import com.jiva.mandi.core.network.Dispatcher
import com.jiva.mandi.core.network.NiaDispatchers.IO
import com.jiva.mandi.core.network.fake.FakeNiaNetworkDataSource
import com.jiva.mandi.core.network.model.NetworkNewsResource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

/**
 * Fake implementation of the [NewsRepository] that retrieves the news resources from a JSON String.
 *
 * This allows us to run the app with fake data, without needing an internet connection or working
 * backend.
 */
class FakeNewsRepository @Inject constructor(
    @Dispatcher(IO) private val ioDispatcher: CoroutineDispatcher,
    private val datasource: FakeNiaNetworkDataSource,
) : NewsRepository {
    override fun getNewsResources(query: NewsResourceQuery): Flow<List<NewsResource>> {
        return flow {
            emit(
                datasource
                    .getNewsResources()
                    .map(NetworkNewsResource::asEntity),
            )
        }.flowOn(ioDispatcher)
    }


    override suspend fun syncWith(synchronizer: Synchronizer): Boolean {
        return true
    }
}