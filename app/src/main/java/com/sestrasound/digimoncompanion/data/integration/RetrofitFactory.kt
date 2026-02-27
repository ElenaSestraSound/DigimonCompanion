package com.sestrasound.digimoncompanion.data.integration

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

class RetrofitFactory(val baseUrl: String) {
    private val json = Json {
        ignoreUnknownKeys = true
    }

    fun create(): Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(
            json.asConverterFactory("application/json".toMediaType())
        )
        .build()
}
