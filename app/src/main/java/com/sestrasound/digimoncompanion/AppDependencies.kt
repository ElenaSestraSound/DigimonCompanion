package com.sestrasound.digimoncompanion

import com.sestrasound.digimoncompanion.data.integration.DigimonApi
import com.sestrasound.digimoncompanion.data.integration.RetrofitFactory
import retrofit2.Retrofit

internal object AppDependencies {
    private val retrofitInstance: Retrofit by lazy {
        RetrofitFactory(baseUrl = "https://digi-api.com/").create()
    }

    private val digimonApi: DigimonApi by lazy {
        retrofitInstance.create(DigimonApi::class.java)
    }
}
