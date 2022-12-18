package ru.fbtw.pizzaapp.controller

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import ru.fbtw.pizzaapp.domain.User
import ru.fbtw.pizzaapp.dto.*
import ru.fbtw.pizzaapp.service.DeliveryService

@RestController
class DeliveryController(
    private val deliveryService: DeliveryService
) {
    @PostMapping(path = ["/delivery/price"])
    fun postDeliveryPrice(
        @AuthenticationPrincipal user: User,
        @RequestBody orderCreateDto: OrderCreateDto
    ): PizzaPricePreview {
        return deliveryService.getDeliveryPrice(user, orderCreateDto.deliveryAddress)
    }

    @GetMapping(path = ["/delivery/order/"])
    fun getOrders(
        @AuthenticationPrincipal user: User,
    ): List<OrderDto> {
        return deliveryService.getOrders(user)
    }

    @PostMapping(path = ["/delivery/route"])
    fun postPosition(
        @AuthenticationPrincipal user: User,
        @RequestBody positionDto: PositionDto,
    ): List<PositionInfoDto> {
        return deliveryService.updateCourierPosition(user, positionDto)
    }

    @GetMapping(path = ["/delivery/info/{orderId}"])
    fun getDeliveryInfo(
        @AuthenticationPrincipal user: User,
        @PathVariable orderId: Long,
    ): RouteInformationDto {
        return deliveryService.getDeliveryInfo(user, orderId)
    }
}