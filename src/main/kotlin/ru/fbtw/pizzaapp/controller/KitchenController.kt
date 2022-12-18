package ru.fbtw.pizzaapp.controller

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import ru.fbtw.pizzaapp.domain.OrderState
import ru.fbtw.pizzaapp.domain.User
import ru.fbtw.pizzaapp.dto.OrderDto
import ru.fbtw.pizzaapp.service.KitchenService

@RestController
class KitchenController(
    private val kitchenService: KitchenService,
) {
    @GetMapping(path = ["/kitchen/order/"])
    fun getOrders(
        @AuthenticationPrincipal user: User,
    ): List<OrderDto> {
        return kitchenService.getOrders(user)
    }

    @GetMapping(path = ["/kitchen/notifications/"])
    fun getNotifications(
        @AuthenticationPrincipal user: User,
    ): List<String> {
        return kitchenService.getNotifications(user)
    }

    @GetMapping(path = ["/kitchen/order/{orderId}"])
    fun postOrderStatus(
        @AuthenticationPrincipal user: User,
        @PathVariable orderId: Long,
        @RequestBody orderState: OrderState,
    ): List<OrderDto> {
        return kitchenService.changeState(user, orderId, orderState,)
    }
}