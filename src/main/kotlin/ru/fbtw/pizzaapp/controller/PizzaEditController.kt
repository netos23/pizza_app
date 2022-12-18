package ru.fbtw.pizzaapp.controller

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*
import ru.fbtw.pizzaapp.domain.User
import ru.fbtw.pizzaapp.dto.IngredientDto
import ru.fbtw.pizzaapp.dto.PizzaDto
import ru.fbtw.pizzaapp.dto.ReceptDto
import ru.fbtw.pizzaapp.service.PizzaService

@RestController
class PizzaEditController(
    private val pizzaService: PizzaService,
) {

    @PatchMapping(path = ["/pizza/edit"])
    fun patchPizza(
        @AuthenticationPrincipal user: User,
        @RequestBody pizzaDto: PizzaDto,
    ): PizzaDto {
        return pizzaService.editPizza(user, pizzaDto)
    }

    @PostMapping(path = ["/pizza/edit"])
    fun postPizza(
        @AuthenticationPrincipal user: User,
        @RequestBody pizzaDto: PizzaDto,
    ): PizzaDto {
        return pizzaService.addPizza(user, pizzaDto)
    }


    @DeleteMapping(path = ["/pizza/edit/{pizzaId}"])
    fun deletePizza(
        @AuthenticationPrincipal user: User,
        @PathVariable pizzaId: Long,
    ): PizzaDto {
        return pizzaService.deletePizza(user, pizzaId)
    }

    @PatchMapping(path = ["/ingredient/edit"])
    fun patchIngredient(
        @AuthenticationPrincipal user: User,
        @RequestBody ingredientDto: IngredientDto,
    ): IngredientDto {
        return pizzaService.editIngredient(user, ingredientDto)
    }

    @PostMapping(path = ["/ingredient/edit"])
    fun postIngredient(
        @AuthenticationPrincipal user: User,
        @RequestBody ingredientDto: IngredientDto,
    ): IngredientDto {
        return pizzaService.addIngredient(user, ingredientDto)
    }


    @DeleteMapping(path = ["/ingredient/edit/{ingredientId}"])
    fun deleteIngredient(
        @AuthenticationPrincipal user: User,
        @PathVariable ingredientId: Long,
    ): IngredientDto {
        return pizzaService.deleteIngredient(user, ingredientId)
    }

    @PatchMapping(path = ["/recept/edit"])
    fun patchRecept(
        @AuthenticationPrincipal user: User,
        @RequestBody receptDto: ReceptDto,
    ): ReceptDto {
        return pizzaService.editRecept(user, receptDto)
    }

    @PostMapping(path = ["/recept/edit"])
    fun postRecept(
        @AuthenticationPrincipal user: User,
        @RequestBody receptDto: ReceptDto,
    ): ReceptDto {
        return pizzaService.addRecept(user, receptDto)
    }


    @DeleteMapping(path = ["/recept/edit/{receptId}"])
    fun deleteRecept(
        @AuthenticationPrincipal user: User,
        @PathVariable receptId: Long,
    ): ReceptDto {
        return pizzaService.deleteRecept(user, receptId)
    }
}