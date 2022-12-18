package ru.fbtw.pizzaapp.dto

import ru.fbtw.pizzaapp.domain.UserRole
import java.io.Serializable
import java.time.LocalDate

/**
 * A DTO for the {@link ru.fbtw.pizzaapp.domain.User} entity
 */
data class UserDto(
    val id: Long? = null,
    val name: String? = null,
    val surname: String? = null,
    val birthday: LocalDate? = null,
    val email: String? = null,
    val isActive: Boolean = false,
    val roles: MutableSet<MutableSet<UserRole>> = mutableSetOf()
) : Serializable