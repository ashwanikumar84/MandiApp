package com.jiva.mandi.core.domain

import com.jiva.mandi.core.data.repository.NewsRepository
import com.jiva.mandi.core.data.repository.NewsResourceQuery
import com.jiva.mandi.core.data.repository.UserDataRepository
import com.jiva.mandi.core.domain.model.UserNewsResource
import com.jiva.mandi.core.domain.model.mapToUserNewsResources
import com.jiva.mandi.core.model.data.NewsResource
import com.jiva.mandi.core.model.data.UserData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.filterNot
import javax.inject.Inject

/**
 * A use case responsible for obtaining news resources with their associated bookmarked (also known
 * as "saved") state.
 *
 * an additonal layer to perform some operation on fetched data fo example.
 * some kind of filteration on basis of ids or fetch data from two differnt repositories and then combine it here.
 *
 *
 * private fun Flow<List<NewsResource>>.mapToUserNewsResources(
 * userDataStream: Flow<UserData>,
 * ): Flow<List<UserNewsResource>> =
 * filterNot { it.isEmpty() }
 * .combine(userDataStream) { newsResources, userData ->
 * newsResources.mapToUserNewsResources(userData)
 * }
 *
 */
class GetUserNewsResourcesUseCase @Inject constructor(
    private val newsRepository: NewsRepository,
    private val userDataRepository: UserDataRepository
) {

    /**
     * Returns a list of UserNewsResources which match the supplied set of topic ids.
     *
     * @param query - Summary of query parameters for news resources.
     */
    operator fun invoke(
        query: NewsResourceQuery = NewsResourceQuery(),
    ): Flow<List<UserNewsResource>> =
        newsRepository.getNewsResources(
            query = query,
        ).mapToUserNewsResources(userDataRepository.userData)
}

private fun Flow<List<NewsResource>>.mapToUserNewsResources(
    userDataStream: Flow<UserData>,
): Flow<List<UserNewsResource>> =
    filterNot { it.isEmpty() }
        .combine(userDataStream) { newsResources, userData ->
            newsResources.mapToUserNewsResources(userData)
        }