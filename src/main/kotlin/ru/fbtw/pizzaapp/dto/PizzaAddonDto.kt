package ru.fbtw.pizzaapp.dto

import ru.fbtw.pizzaapp.domain.PizzaAddonAction
import java.io.Serializable

/**
 * A DTO for the {@link ru.fbtw.pizzaapp.domain.PizzaAddon} entity
 */
data class PizzaAddonDto(
    val id: Long? = null,
    val description: String? = null,
    val action: PizzaAddonAction? = null,
    val ingredient: IngredientAmountDto? = null,
    val price: Long? = 1,
    val oldPrice: Long? = 1
) : Serializable