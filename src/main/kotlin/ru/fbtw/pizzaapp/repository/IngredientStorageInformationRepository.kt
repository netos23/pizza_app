package ru.fbtw.pizzaapp.repository;

import org.springframework.data.repository.CrudRepository
import ru.fbtw.pizzaapp.domain.IngredientStorageInformation
import java.util.*

interface IngredientStorageInformationRepository : CrudRepository<IngredientStorageInformation, Long> {
    override fun <S : IngredientStorageInformation?> save(entity: S): S {
        TODO("Not yet implemented")
    }

    override fun findById(id: Long): Optional<IngredientStorageInformation> {
        TODO("Not yet implemented")
    }

    override fun existsById(id: Long): Boolean {
        TODO("Not yet implemented")
    }

    override fun <S : IngredientStorageInformation?> saveAll(entities: MutableIterable<S>): MutableIterable<S> {
        TODO("Not yet implemented")
    }

    override fun findAll(): MutableIterable<IngredientStorageInformation> {
        TODO("Not yet implemented")
    }

    override fun findAllById(ids: MutableIterable<Long>): MutableIterable<IngredientStorageInformation> {
        TODO("Not yet implemented")
    }

    override fun count(): Long {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: Long) {
        TODO("Not yet implemented")
    }

    override fun delete(entity: IngredientStorageInformation) {
        TODO("Not yet implemented")
    }

    override fun deleteAllById(ids: MutableIterable<Long>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll(entities: MutableIterable<IngredientStorageInformation>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll() {
        TODO("Not yet implemented")
    }
}