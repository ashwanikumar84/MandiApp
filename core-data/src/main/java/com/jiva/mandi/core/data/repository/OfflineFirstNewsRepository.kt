package com.jiva.mandi.core.data.repository

import com.jiva.mandi.core.data.Synchronizer
import com.jiva.mandi.core.model.data.NewsResource
import kotlinx.coroutines.flow.Flow

class OfflineFirstNewsRepository : NewsRepository {

    override fun getNewsResourcesStream(): Flow<List<NewsResource>> {
        TODO("Not yet implemented")
    }

    override suspend fun syncWith(synchronizer: Synchronizer): Boolean {
        TODO("Not yet implemented")
    }

}