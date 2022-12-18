package ru.fbtw.pizzaapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PizzaAppBackendApplication

fun main(args: Array<String>) {
    runApplication<PizzaAppBackendApplication>(*args)
}
