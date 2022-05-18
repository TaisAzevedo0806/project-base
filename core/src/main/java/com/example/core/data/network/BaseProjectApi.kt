package com.example.core.data.network

import retrofit2.http.GET

interface BaseProjectApi {

    @GET()
    suspend fun getData()

}