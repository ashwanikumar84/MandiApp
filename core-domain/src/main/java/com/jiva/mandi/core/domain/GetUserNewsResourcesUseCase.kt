package com.jiva.mandi.core.domain

import com.jiva.mandi.core.data.repository.NewsRepository
import javax.inject.Inject

class GetUserNewsResourcesUseCase @Inject constructor(private val newsRepository: NewsRepository) {
}