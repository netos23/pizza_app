package ru.fbtw.pizzaapp.repository;

import org.springframework.data.repository.CrudRepository
import ru.fbtw.pizzaapp.domain.Pizza
import java.util.*

interface PizzaRepository : CrudRepository<Pizza, Long> {
    override fun <S : Pizza?> save(entity: S): S {
        TODO("Not yet implemented")
    }

    override fun findById(id: Long): Optional<Pizza> {
        TODO("Not yet implemented")
    }

    override fun existsById(id: Long): Boolean {
        TODO("Not yet implemented")
    }

    override fun <S : Pizza?> saveAll(entities: MutableIterable<S>): MutableIterable<S> {
        TODO("Not yet implemented")
    }

    override fun findAll(): MutableIterable<Pizza> {
        TODO("Not yet implemented")
    }

    override fun findAllById(ids: MutableIterable<Long>): MutableIterable<Pizza> {
        TODO("Not yet implemented")
    }

    override fun count(): Long {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: Long) {
        TODO("Not yet implemented")
    }

    override fun delete(entity: Pizza) {
        TODO("Not yet implemented")
    }

    override fun deleteAllById(ids: MutableIterable<Long>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll(entities: MutableIterable<Pizza>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll() {
        TODO("Not yet implemented")
    }
}