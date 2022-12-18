package ru.fbtw.pizzaapp.dto

import java.io.Serializable

data class PasswordChangeDto(
    val oldPassword: String,
    val newPassword: String,
    val newPasswordConfirm: String,
) : Serializable