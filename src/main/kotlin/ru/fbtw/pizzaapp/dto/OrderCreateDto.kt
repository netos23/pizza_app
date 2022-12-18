package ru.fbtw.pizzaapp.dto

import java.io.Serializable

/**
 * A DTO for the {@link ru.fbtw.pizzaapp.domain.Order} entity
 */
data class OrderCreateDto(
    val offerIds: MutableList<Long>,
    val deliveryAddress: String,
) : Serializable