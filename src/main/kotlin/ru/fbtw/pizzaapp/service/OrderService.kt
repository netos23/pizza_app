package ru.fbtw.pizzaapp.service

import org.springframework.stereotype.Service
import ru.fbtw.pizzaapp.domain.User
import ru.fbtw.pizzaapp.dto.BasketDto
import ru.fbtw.pizzaapp.dto.OrderCreateDto
import ru.fbtw.pizzaapp.dto.OrderDto

@Service
class OrderService(
    private val userService: UserService,
    private val basketService: BasketService,
) {
    fun createOrder(user: User, order: OrderCreateDto): OrderDto {
        TODO("Not yet implemented")
    }

    fun canselOrder(user: User, orderId: Long): OrderDto {
        TODO("Not yet implemented")
    }

    fun getOrders(user: User): List<OrderDto> {
        TODO("Not yet implemented")
    }

    fun getOrder(user: User, orderId: Long): OrderDto {
        TODO("Not yet implemented")
    }

}