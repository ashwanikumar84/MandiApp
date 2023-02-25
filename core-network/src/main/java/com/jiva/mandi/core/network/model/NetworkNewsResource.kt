package com.jiva.mandi.core.network.model

import com.jiva.mandi.core.model.data.NewsResource
import kotlinx.serialization.Serializable

@Serializable
data class NetworkNewsResource(
    val id: String,
    val title: String,
    val content: String,
    val url: String,
    val headerImageUrl: String,
    val topics: List<String> = listOf(),
)


fun NetworkNewsResource.asExternalModel() = NewsResource(
    id = id,
    title = title,
    content = content,
    url = url,
    headerImageUrl = headerImageUrl,
    topics = listOf(),
)