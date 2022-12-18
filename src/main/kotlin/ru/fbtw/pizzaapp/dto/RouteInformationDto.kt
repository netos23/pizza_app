package ru.fbtw.pizzaapp.dto

import java.io.Serializable
import java.time.LocalDate

data class RouteInformationDto(
    val positionsInfo: List<PositionInfoDto>,
    val expectedTime: LocalDate,
): Serializable