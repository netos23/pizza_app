package ru.fbtw.pizzaapp.dto

import java.io.Serializable

data class PositionDto(
    val lat: Double,
    val lon: Double,
) : Serializable
