package ru.fbtw.pizzaapp.service

import org.springframework.stereotype.Service
import ru.fbtw.pizzaapp.domain.OrderState
import ru.fbtw.pizzaapp.domain.User
import ru.fbtw.pizzaapp.dto.OrderDto

@Service
class KitchenService(
    private val userService: UserService,
    private val pizzaService: PizzaService,
) {
    fun getOrders(user: User): List<OrderDto> {
        TODO("Not yet implemented")
    }

    fun changeState(user: User, orderId: Long, orderState: OrderState): List<OrderDto> {
        TODO("Not yet implemented")
    }

    fun getNotifications(user: User): List<String> {
        TODO("Not yet implemented")
    }
}