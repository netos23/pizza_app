package ru.fbtw.pizzaapp.dto

import java.io.Serializable

/**
 * A DTO for the {@link ru.fbtw.pizzaapp.domain.Offer} entity
 */
data class OfferDto(
    val id: Long? = null,
    val pizza: PizzaDto? = null,
    val appliedAddons: MutableList<PizzaAppliedAddonDto> = mutableListOf()
) : Serializable