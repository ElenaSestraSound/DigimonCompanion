package com.sestrasound.digimoncompanion

import com.sestrasound.digimoncompanion.data.RepositoryImpl
import com.sestrasound.digimoncompanion.data.integration.DigimonApi
import com.sestrasound.digimoncompanion.data.integration.RetrofitFactory
import com.sestrasound.digimoncompanion.domain.Digimon
import com.sestrasound.digimoncompanion.domain.Repository
import retrofit2.Retrofit

internal object AppDependencies {
    private val retrofitInstance: Retrofit by lazy {
        RetrofitFactory(baseUrl = "https://digi-api.com/").create()
    }

    private val digimonApi: DigimonApi by lazy {
        retrofitInstance.create(DigimonApi::class.java)
    }

    val digimonRepo: Repository<Digimon> by lazy {
        RepositoryImpl(api = digimonApi)
    }
}
