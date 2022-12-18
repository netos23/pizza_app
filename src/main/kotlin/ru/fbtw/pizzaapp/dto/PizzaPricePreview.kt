package ru.fbtw.pizzaapp.dto

import java.io.Serializable

data class PizzaPricePreview(
    val price: Long,
    val oldPrice: Long?
) : Serializable