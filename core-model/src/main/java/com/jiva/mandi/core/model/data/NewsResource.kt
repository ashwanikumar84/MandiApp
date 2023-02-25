package com.jiva.mandi.core.model.data

data class NewsResource(
    val id: String,
    val title: String,
    val content: String,
    val url: String,
    val headerImageUrl: String?,
    val topics: List<Topic>,
)