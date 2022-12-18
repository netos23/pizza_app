package ru.fbtw.pizzaapp.controller

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*
import ru.fbtw.pizzaapp.domain.User
import ru.fbtw.pizzaapp.dto.BasketDto
import ru.fbtw.pizzaapp.dto.PizzaPreviewConfiguration
import ru.fbtw.pizzaapp.service.BasketService

@RestController
class BasketController(
    private  val basketService: BasketService,
) {

    @GetMapping(path = ["/basket/"])
    fun getBasket(
        @AuthenticationPrincipal user: User,
    ): BasketDto {
        return basketService.getBasket(user)
    }

    @PostMapping(path = ["/basket/"])
    fun postPizzaToBasket(
        @AuthenticationPrincipal user: User,
        @RequestBody configuration: PizzaPreviewConfiguration
    ): BasketDto {
        return basketService.addToBasket(user,configuration)
    }

    @DeleteMapping(path = ["/basket/"])
    fun deletePizzaFromBasket(
        @AuthenticationPrincipal user: User,
        @RequestBody configuration: PizzaPreviewConfiguration
    ): BasketDto {
        return basketService.deleteFromBasket(user,configuration)
    }

    @PatchMapping(path = ["/basket/"])
    fun patchPizzaFromBasket(
        @AuthenticationPrincipal user: User,
        @RequestBody configuration: PizzaPreviewConfiguration
    ): BasketDto {
        return basketService.editPizzaInBasket(user,configuration)
    }
}