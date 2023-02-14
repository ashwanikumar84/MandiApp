package com.jiva.mandi.core.network.model

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
