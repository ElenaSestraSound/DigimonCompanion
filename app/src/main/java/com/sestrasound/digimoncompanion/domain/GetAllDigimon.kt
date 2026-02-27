package com.sestrasound.digimoncompanion.domain

import com.sestrasound.digimoncompanion.AppDependencies
import kotlinx.coroutines.flow.Flow

internal fun getAllDigimon(page: Int, pageSize: Int = 10): Flow<List<Digimon>> =
    GetAllDigimon().invoke(page = page, pageSize = pageSize)

internal class GetAllDigimon(
    val digimonRepo: () -> Repository<Digimon> = { AppDependencies.digimonRepo },
) {
    fun invoke(page: Int, pageSize: Int): Flow<List<Digimon>> =
        digimonRepo().getAll(page = page, pageSize = pageSize)
}
