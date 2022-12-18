package ru.fbtw.pizzaapp.dto

import java.io.Serializable

/**
 * A DTO for the {@link ru.fbtw.pizzaapp.domain.ReceptStep} entity
 */
data class ReceptStepDto(
    val id: Long? = null,
    val title: String? = null,
    val description: String? = null,
    val ingredientAmountList: MutableList<IngredientAmountDto> = mutableListOf()
) : Serializable