package ru.fbtw.pizzaapp.controller

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*
import ru.fbtw.pizzaapp.domain.User
import ru.fbtw.pizzaapp.dto.BasketDto
import ru.fbtw.pizzaapp.dto.OrderCreateDto
import ru.fbtw.pizzaapp.dto.OrderDto
import ru.fbtw.pizzaapp.dto.PizzaPreviewConfiguration
import ru.fbtw.pizzaapp.service.OrderService

@RestController
class OrderController(
    val orderService: OrderService,
) {
    @PostMapping(path = ["/order/"])
    fun postOrder(
        @AuthenticationPrincipal user: User,
        @RequestBody order: OrderCreateDto
    ): OrderDto {
        return orderService.createOrder(user, order)
    }

    @DeleteMapping(path = ["/order/{orderId}"])
    fun deleteOrder(
        @AuthenticationPrincipal user: User,
        @PathVariable orderId: Long,
    ): OrderDto {
        return orderService.canselOrder(user, orderId)
    }


    @GetMapping(path = ["/order/"])
    fun getOrders(
        @AuthenticationPrincipal user: User,
    ): List<OrderDto> {
        return orderService.getOrders(user)
    }


    @PostMapping(path = ["/order/{orderId}"])
    fun getOrder(
        @AuthenticationPrincipal user: User,
        @PathVariable orderId: Long,
    ): OrderDto {
        return orderService.getOrder(user, orderId)
    }


}