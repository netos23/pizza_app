package ru.fbtw.pizzaapp.dto

import ru.fbtw.pizzaapp.domain.OrderState
import java.io.Serializable

/**
 * A DTO for the {@link ru.fbtw.pizzaapp.domain.Order} entity
 */
data class OrderDto(
    val id: Long? = null,
    val price: Long = 1,
    val oldPrice: Long? = 1,
    val state: OrderState = OrderState.verification,
    val cookName: String? = null,
    val cookSurname: String? = null,
    val deliverymanName: String? = null,
    val deliverymanSurname: String? = null,
    val offers: MutableList<OfferDto> = mutableListOf()
) : Serializable