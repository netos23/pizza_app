package ru.fbtw.pizzaapp.service

import org.springframework.stereotype.Service
import ru.fbtw.pizzaapp.domain.User
import ru.fbtw.pizzaapp.dto.*
import ru.fbtw.pizzaapp.repository.UserRepository

@Service
class DeliveryFacadeService(
    private val userService: UserService,
    private val deliveryServices: List<DeliveryService> = listOf(
        WalkingDeliveryService(),
        CarDeliveryService(),
    ),
) : DeliveryService {


    override fun hasDelivery(address: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun getDeliveryPrice(user: User, deliveryAddress: String): PizzaPricePreview {
        TODO("Not yet implemented")
    }

    override fun getOrders(user: User): List<OrderDto> {
        TODO("Not yet implemented")
    }

    override fun updateCourierPosition(user: User, positionDto: PositionDto): List<PositionInfoDto> {
        TODO("Not yet implemented")
    }

    override fun getDeliveryInfo(user: User, orderId: Long): RouteInformationDto {
        TODO("Not yet implemented")
    }

    override fun equals(other: Any?): Boolean {
        return this === other
    }

    override fun hashCode(): Int {
        return System.identityHashCode(this)
    }
}