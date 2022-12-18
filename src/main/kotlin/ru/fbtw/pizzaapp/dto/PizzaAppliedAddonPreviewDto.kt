package ru.fbtw.pizzaapp.dto

import java.io.Serializable

/**
 * A DTO for the {@link ru.fbtw.pizzaapp.domain.PizzaAppliedAddon} entity
 */
data class PizzaAppliedAddonPreviewDto(val addonId: Long? = null, val count: Long = 1) : Serializable