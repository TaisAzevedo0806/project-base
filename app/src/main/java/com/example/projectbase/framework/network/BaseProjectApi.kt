package com.example.projectbase.framework.network

import retrofit2.http.GET

interface BaseProjectApi {

    @GET()
    suspend fun getData()

}