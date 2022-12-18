package ru.fbtw.pizzaapp.dto

import ru.fbtw.pizzaapp.domain.IngredientType
import java.io.Serializable

/**
 * A DTO for the {@link ru.fbtw.pizzaapp.domain.Ingredient} entity
 */
data class IngredientDto(
    val id: Long? = null,
    val name: String? = null,
    val type: IngredientType = IngredientType.piece
) :
    Serializable