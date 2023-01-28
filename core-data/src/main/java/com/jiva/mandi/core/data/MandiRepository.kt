package com.jiva.mandi.core.data.di


interface MandiRepository {

    suspend fun add(name: String)

}