package com.sestrasound.digimoncompanion.data.integration

import retrofit2.http.GET
import retrofit2.http.Query

interface DigimonApi {
    @GET("api/v1/digimon")
    suspend fun getAll(
        @Query("page") page: Int,
        @Query("pageSize") pageSize: Int,
    ): DigimonListResponseDto
}
