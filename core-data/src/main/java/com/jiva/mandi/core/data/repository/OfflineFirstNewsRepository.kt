package com.jiva.mandi.core.data.repository

import com.jiva.mandi.core.data.Synchronizer
import com.jiva.mandi.core.model.data.NewsResource
import com.jiva.mandi.core.network.JivaNetworkDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

/**
 * Disk storage backed implementation of the [NewsRepository].
 * Reads are exclusively from local storage to support offline access.
 */
class OfflineFirstNewsRepository @Inject constructor(private val network: JivaNetworkDataSource) :
    NewsRepository {

    override fun getNewsResources(): Flow<List<NewsResource>> {
        TODO("Not yet implemented fully")
        // can only be call from suspend block
        //network.getNewsResources()
        val session = runBlocking {
            network.getNewsResources(mutableListOf<String>("test"))
        }
    }
    
    override suspend fun syncWith(synchronizer: Synchronizer): Boolean {
        TODO("Not yet implemented")
    }

}