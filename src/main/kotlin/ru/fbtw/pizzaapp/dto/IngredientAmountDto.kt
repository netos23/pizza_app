package ru.fbtw.pizzaapp.dto

import java.io.Serializable

/**
 * A DTO for the {@link ru.fbtw.pizzaapp.domain.IngredientAmount} entity
 */
data class IngredientAmountDto(val id: Long? = null, val ingredient: IngredientDto? = null) : Serializable