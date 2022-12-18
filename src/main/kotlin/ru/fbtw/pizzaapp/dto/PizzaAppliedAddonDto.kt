package ru.fbtw.pizzaapp.dto

import java.io.Serializable

/**
 * A DTO for the {@link ru.fbtw.pizzaapp.domain.PizzaAppliedAddon} entity
 */
data class PizzaAppliedAddonDto(val id: Long? = null, val addon: PizzaAddonDto? = null, val count: Long = 1) :
    Serializable