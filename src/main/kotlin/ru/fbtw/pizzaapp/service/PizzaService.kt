package ru.fbtw.pizzaapp.service

import org.springframework.stereotype.Service
import ru.fbtw.pizzaapp.domain.User
import ru.fbtw.pizzaapp.dto.*
import ru.fbtw.pizzaapp.repository.*

@Service
class PizzaService(
   private val userService: UserService,
   private val pizzaRepository: PizzaRepository,
   private val receptRepository: ReceptRepository,
   private val receptStepRepository: ReceptStepRepository,
   private val pizzaPriceRepository: PizzaPriceRepository,
   private val pizzaAddonRepository: PizzaAddonRepository,
   private val ingredientStorageInformationRepository: IngredientStorageInformationRepository,
   private val ingredientAmountRepository: IngredientAmountRepository,
   private val ingredientRepository: IngredientRepository,
   private val secludeService: SecludeService,

) {
    fun getPizzaList(page: Long?, pageSize: Long?): List<PizzaDto> {
        TODO("Not yet implemented")
    }

    fun getPizza(id: Long): PizzaWithAddonsDto {
        TODO("Not yet implemented")
    }

    fun deletePizza(user: User, pizzaId: Long): PizzaDto {
        TODO("Not yet implemented")
    }

    fun addPizza(user: User, pizzaDto: PizzaDto): PizzaDto {
        TODO("Not yet implemented")
    }

    fun editPizza(user: User, pizzaDto: PizzaDto): PizzaDto {
        TODO("Not yet implemented")
    }

    fun editIngredient(user: User, ingredientDto: IngredientDto): IngredientDto {
        TODO("Not yet implemented")
    }

    fun addIngredient(user: User, ingredientDto: IngredientDto): IngredientDto {
        TODO("Not yet implemented")
    }

    fun deleteIngredient(user: User, ingredientId: Long): IngredientDto {
        TODO("Not yet implemented")
    }

    fun deleteRecept(user: User, receptId: Long): ReceptDto {
        TODO("Not yet implemented")
    }

    fun editRecept(user: User, receptDto: ReceptDto): ReceptDto {
        TODO("Not yet implemented")
    }

    fun addRecept(user: User, receptDto: ReceptDto): ReceptDto {
        TODO("Not yet implemented")
    }

}