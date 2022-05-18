package com.example.core.data.network.interceptor

import okhttp3.Interceptor
import okhttp3.Response

class AuthorizationInterceptor(private val privateKey: String) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val requestUrl = request.url

        val newUrl = requestUrl.newBuilder()
            .addQueryParameter(QUERY_PARAMETER_API_KEY, privateKey)
            .build()

        return chain.proceed(
            request.newBuilder()
                .url(newUrl)
                .build()
        )
    }

    companion object {
        private const val QUERY_PARAMETER_API_KEY = "key"
    }
}