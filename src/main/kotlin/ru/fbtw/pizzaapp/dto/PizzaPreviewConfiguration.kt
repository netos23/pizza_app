package ru.fbtw.pizzaapp.dto

import java.io.Serializable

data class PizzaPreviewConfiguration(
    val pizzaId: Long,
    val addons: List<PizzaAppliedAddonPreviewDto>,
) : Serializable