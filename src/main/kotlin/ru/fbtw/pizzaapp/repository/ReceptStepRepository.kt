package ru.fbtw.pizzaapp.repository;

import org.springframework.data.repository.CrudRepository
import ru.fbtw.pizzaapp.domain.ReceptStep
import java.util.*

interface ReceptStepRepository : CrudRepository<ReceptStep, Long> {
    override fun <S : ReceptStep?> save(entity: S): S {
        TODO("Not yet implemented")
    }

    override fun findById(id: Long): Optional<ReceptStep> {
        TODO("Not yet implemented")
    }

    override fun existsById(id: Long): Boolean {
        TODO("Not yet implemented")
    }

    override fun <S : ReceptStep?> saveAll(entities: MutableIterable<S>): MutableIterable<S> {
        TODO("Not yet implemented")
    }

    override fun findAll(): MutableIterable<ReceptStep> {
        TODO("Not yet implemented")
    }

    override fun findAllById(ids: MutableIterable<Long>): MutableIterable<ReceptStep> {
        TODO("Not yet implemented")
    }

    override fun count(): Long {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: Long) {
        TODO("Not yet implemented")
    }

    override fun delete(entity: ReceptStep) {
        TODO("Not yet implemented")
    }

    override fun deleteAllById(ids: MutableIterable<Long>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll(entities: MutableIterable<ReceptStep>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll() {
        TODO("Not yet implemented")
    }
}