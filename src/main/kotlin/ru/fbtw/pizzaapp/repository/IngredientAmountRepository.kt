package ru.fbtw.pizzaapp.repository;

import org.springframework.data.repository.CrudRepository
import ru.fbtw.pizzaapp.domain.IngredientAmount
import java.util.*

interface IngredientAmountRepository : CrudRepository<IngredientAmount, Long> {

    override fun findById(id: Long): Optional<IngredientAmount> 

    override fun existsById(id: Long): Boolean 

    override fun <S : IngredientAmount?> save(entity: S): S 

    override fun <S : IngredientAmount?> saveAll(entities: MutableIterable<S>): MutableIterable<S> 

    override fun findAll(): MutableIterable<IngredientAmount> 

    override fun findAllById(ids: MutableIterable<Long>): MutableIterable<IngredientAmount> 

    override fun count(): Long 

    override fun deleteById(id: Long) 

    override fun delete(entity: IngredientAmount) 

    override fun deleteAllById(ids: MutableIterable<Long>) 

    override fun deleteAll(entities: MutableIterable<IngredientAmount>) 

    override fun deleteAll() 
}