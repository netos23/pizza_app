package ru.fbtw.pizzaapp.service

import ru.fbtw.pizzaapp.domain.User
import ru.fbtw.pizzaapp.dto.*

sealed interface DeliveryService {
    fun hasDelivery(address: String): Boolean
    fun getDeliveryPrice(user: User, deliveryAddress: String): PizzaPricePreview
    fun getOrders(user: User): List<OrderDto>
    fun updateCourierPosition(user: User, positionDto: PositionDto): List<PositionInfoDto>
    fun getDeliveryInfo(user: User, orderId: Long): RouteInformationDto
}