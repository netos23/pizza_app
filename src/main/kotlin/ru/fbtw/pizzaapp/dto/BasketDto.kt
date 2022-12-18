package ru.fbtw.pizzaapp.dto

import java.io.Serializable

/**
 * A DTO for the {@link ru.fbtw.pizzaapp.domain.Basket} entity
 */
data class BasketDto(
    val offers: MutableList<OfferDto> = mutableListOf(),
    val price: Long,
    val oldPrice: Long,
) : Serializable