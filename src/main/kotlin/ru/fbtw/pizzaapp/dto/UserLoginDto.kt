package ru.fbtw.pizzaapp.dto

import java.io.Serializable

/**
 * A DTO for the {@link ru.fbtw.pizzaapp.domain.User} entity
 */
data class UserLoginDto(val email: String? = null, val password: String? = null) : Serializable