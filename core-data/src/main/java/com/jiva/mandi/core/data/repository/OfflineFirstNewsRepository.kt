package com.jiva.mandi.core.data.repository

import com.jiva.mandi.core.data.Synchronizer
import com.jiva.mandi.core.model.data.NewsResource
import com.jiva.mandi.core.network.JivaNetworkDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Disk storage backed implementation of the [NewsRepository].
 * Reads are exclusively from local storage to support offline access.
 */
class OfflineFirstNewsRepository @Inject constructor(private val network: JivaNetworkDataSource) :
    NewsRepository {
    override fun getNewsResources(query: NewsResourceQuery): Flow<List<NewsResource>> {
        TODO("Not yet implemented")
    }


    override suspend fun syncWith(synchronizer: Synchronizer): Boolean {
        TODO("Not yet implemented")
    }

}