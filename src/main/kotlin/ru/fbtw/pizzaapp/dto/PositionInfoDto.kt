package ru.fbtw.pizzaapp.dto

import java.io.Serializable

data class PositionInfoDto(
    val positionDto: PositionDto,
    val description: String,
    val pointType: String,
) : Serializable
