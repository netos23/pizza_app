package ru.fbtw.pizzaapp.service

import org.springframework.stereotype.Service
import ru.fbtw.pizzaapp.domain.User
import ru.fbtw.pizzaapp.dto.BasketDto
import ru.fbtw.pizzaapp.dto.PizzaPreviewConfiguration
import ru.fbtw.pizzaapp.dto.PizzaPricePreview
import ru.fbtw.pizzaapp.repository.*

@Service
class BasketService(
    private val userService: UserService,
    private val pizzaRepository: PizzaRepository,
    private val offerRepository: OfferRepository,
    private val addonRepository: PizzaAddonRepository,
    private val appliedAddonRepository: PizzaAddonRepository,
    private val storageInformationRepository: IngredientStorageInformationRepository,
) {

    fun getPizzaOderPreview(user: User, configuration: PizzaPreviewConfiguration): PizzaPricePreview {
        TODO("Not yet implemented")
    }

    fun addToBasket(user: User, configuration: PizzaPreviewConfiguration): BasketDto {
        TODO("Not yet implemented")
    }

    fun deleteFromBasket(user: User, configuration: PizzaPreviewConfiguration): BasketDto {
        TODO("Not yet implemented")
    }

    fun editPizzaInBasket(user: User, configuration: PizzaPreviewConfiguration): BasketDto {
        TODO("Not yet implemented")
    }

    fun getBasket(user: User): BasketDto {
        TODO("Not yet implemented")
    }
}