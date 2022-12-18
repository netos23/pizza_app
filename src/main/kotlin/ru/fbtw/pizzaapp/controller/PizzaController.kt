package ru.fbtw.pizzaapp.controller

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*
import ru.fbtw.pizzaapp.domain.User
import ru.fbtw.pizzaapp.dto.PizzaDto
import ru.fbtw.pizzaapp.dto.PizzaPreviewConfiguration
import ru.fbtw.pizzaapp.dto.PizzaPricePreview
import ru.fbtw.pizzaapp.dto.PizzaWithAddonsDto
import ru.fbtw.pizzaapp.service.BasketService
import ru.fbtw.pizzaapp.service.PizzaService

@RestController
class PizzaController(
    private val pizzaService: PizzaService,
    private val basketService: BasketService,
) {

    @GetMapping(path = ["/pizza/"])
    fun getPizzaList(@RequestParam page: Long?, @RequestParam pageSize: Long?): List<PizzaDto> {
        return pizzaService.getPizzaList(page, pageSize)
    }

    @GetMapping(path = ["/pizza/{id}"])
    fun getPizza(@PathVariable id: Long): PizzaWithAddonsDto {
        return pizzaService.getPizza(id)
    }

    @PostMapping(path = ["/pizza/price/}"])
    fun postPizzaPricePreview(
        @AuthenticationPrincipal user: User,
        @RequestBody configuration: PizzaPreviewConfiguration,
    ): PizzaPricePreview {
        return basketService.getPizzaOderPreview(user, configuration)
    }

}