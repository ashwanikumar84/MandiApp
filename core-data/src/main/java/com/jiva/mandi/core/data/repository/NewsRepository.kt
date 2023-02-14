package com.jiva.mandi.core.data.repository

import com.jiva.mandi.core.data.Syncable
import com.jiva.mandi.core.model.data.NewsResource
import kotlinx.coroutines.flow.Flow

interface NewsRepository : Syncable {

    /**
     * Returns available news resources as a stream.
     */
    fun getNewsResources(): Flow<List<NewsResource>>

}

