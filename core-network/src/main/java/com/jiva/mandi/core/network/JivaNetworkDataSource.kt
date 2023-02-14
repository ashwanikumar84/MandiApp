package com.jiva.mandi.core.network

import com.jiva.mandi.core.network.model.NetworkNewsResource

interface JivaNetworkDataSource {

    suspend fun getNewsResources(ids: List<String>? = null): List<NetworkNewsResource>

}