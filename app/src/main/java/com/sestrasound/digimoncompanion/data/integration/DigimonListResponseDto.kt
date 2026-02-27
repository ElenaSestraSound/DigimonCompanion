package com.sestrasound.digimoncompanion.data.integration

import com.sestrasound.digimoncompanion.domain.Digimon
import kotlinx.serialization.Serializable

@Serializable
data class DigimonListResponseDto(
    val content: List<DigimonSummaryDto>,
    val pageable: PageableDto,
)

@Serializable
data class DigimonSummaryDto(
    val id: Int,
    val name: String,
    val href: String,
    val image: String,
) {
    fun toDomain() = Digimon(
        id = id.toString(),
        name = name,
        image = image,
    )
}

@Serializable
data class PageableDto(
    val currentPage: Int,
    val elementsOnPage: Int,
    val totalElements: Int,
    val totalPages: Int,
    val previousPage: String?,
    val nextPage: String?,
)
