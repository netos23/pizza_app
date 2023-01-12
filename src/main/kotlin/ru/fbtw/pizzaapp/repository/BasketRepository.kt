package ru.fbtw.pizzaapp.repository;


import org.springframework.data.repository.CrudRepository
import ru.fbtw.pizzaapp.domain.Basket
import java.util.*

interface BasketRepository : CrudRepository<Basket, Long> {
    override fun <S : Basket?> save(entity: S): S 

    override fun findById(id: Long): Optional<Basket> 

    override fun existsById(id: Long): Boolean 

    override fun <S : Basket?> saveAll(entities: MutableIterable<S>): MutableIterable<S> 

    override fun findAll(): MutableIterable<Basket> 

    override fun findAllById(ids: MutableIterable<Long>): MutableIterable<Basket> 

    override fun count(): Long 

    override fun deleteById(id: Long) 

    override fun delete(entity: Basket) 

    override fun deleteAllById(ids: MutableIterable<Long>) 

    override fun deleteAll(entities: MutableIterable<Basket>) 

    override fun deleteAll() 
}