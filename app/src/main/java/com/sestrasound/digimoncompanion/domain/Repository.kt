package com.sestrasound.digimoncompanion.domain

import kotlinx.coroutines.flow.Flow

interface Repository<T> {
    fun getAll(page: Int, pageSize: Int): Flow<List<T>>
}
