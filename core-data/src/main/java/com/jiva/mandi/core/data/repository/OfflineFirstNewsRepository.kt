package com.jiva.mandi.core.data.repository

import com.jiva.mandi.core.data.Synchronizer
import com.jiva.mandi.core.data.model.NewsResource
import com.jiva.mandi.core.network.JivaNetworkDataSource
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

/**
 * Disk storage backed implementation of the [NewsRepository].
 * Reads are exclusively from local storage to support offline access.
 */
class OfflineFirstNewsRepository @Inject constructor(private val network: JivaNetworkDataSource) :
    NewsRepository {

    override fun getNewsResources(): Flow<List<NewsResource>> {
        // can only be call from suspend block
        //network.getNewsResources()
//        val session = runBlocking {
//            network.getNewsResources(mutableListOf<String>("test"))
//        }
//        return flow<List<NewsResource>> {
//            while(true) {
//                val latestNews = network.getNewsResources(mutableListOf<String>("test"))
//                emit(latestNews) // Emits the result of the request to the flow
//                delay(1000) // Suspends the coroutine for some time
//            }
//        }.map { it.map {  }}

        TODO("Not yet implemented")
    }
    
    override suspend fun syncWith(synchronizer: Synchronizer): Boolean {
        TODO("Not yet implemented")
    }

}