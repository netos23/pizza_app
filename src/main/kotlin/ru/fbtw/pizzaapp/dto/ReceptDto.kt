package ru.fbtw.pizzaapp.dto

import java.io.Serializable

/**
 * A DTO for the {@link ru.fbtw.pizzaapp.domain.Recept} entity
 */
data class ReceptDto(
    val title: String? = null,
    val difficulty: Double? = null,
    val steps: MutableList<ReceptStepDto> = mutableListOf()
) : Serializable