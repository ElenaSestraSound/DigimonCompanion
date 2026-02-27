package com.sestrasound.digimoncompanion.data

import com.sestrasound.digimoncompanion.data.integration.DigimonApi
import com.sestrasound.digimoncompanion.data.integration.DigimonListResponseDto
import com.sestrasound.digimoncompanion.domain.Digimon
import com.sestrasound.digimoncompanion.domain.Repository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class RepositoryImpl(val api: DigimonApi) : Repository<Digimon> {
    override fun getAll(
        page: Int,
        pageSize: Int
    ): Flow<List<Digimon>> = flow {
        val result: DigimonListResponseDto = api.getAll(page = page, pageSize = page)
        emit(value = result.content.map { it.toDomain() })
    }
}
