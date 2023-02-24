package com.jiva.mandi.core.data.repository

import com.jiva.mandi.core.data.Syncable
import com.jiva.mandi.core.data.model.NewsResource
import kotlinx.coroutines.flow.Flow


/**
 * Encapsulation class for query parameters for [NewsResource]
 */
data class NewsResourceQuery(
    /**
     * Topic ids to filter for. Null means any topic id will match.
     */
    val filterTopicIds: Set<String>? = null,
    /**
     * News ids to filter for. Null means any news id will match.
     */
    val filterNewsIds: Set<String>? = null,
)
interface NewsRepository : Syncable {

    /**
     * Returns available news resources as a stream.
     */
    fun getNewsResources(): Flow<List<NewsResource>>

}

