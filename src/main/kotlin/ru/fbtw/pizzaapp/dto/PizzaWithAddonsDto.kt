package ru.fbtw.pizzaapp.dto

import java.io.Serializable

/**
 * A DTO for the {@link ru.fbtw.pizzaapp.domain.Pizza} entity
 */
data class PizzaWithAddonsDto(
    val id: Long? = null,
    val title: String? = null,
    val description: String? = null,
    val pictures: MutableList<MutableList<String>> = mutableListOf(),
    val addons: MutableList<PizzaAddonDto> = mutableListOf()
) : Serializable