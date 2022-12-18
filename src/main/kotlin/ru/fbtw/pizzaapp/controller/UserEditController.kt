package ru.fbtw.pizzaapp.controller

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import ru.fbtw.pizzaapp.domain.User
import ru.fbtw.pizzaapp.dto.PasswordChangeDto
import ru.fbtw.pizzaapp.dto.UserDto
import ru.fbtw.pizzaapp.service.UserService

@RestController
class UserEditController(
    private val userService: UserService,
) {

    @PostMapping(path = ["/user/edit"])
    fun postUser(
        @AuthenticationPrincipal userOwner: User,
        @RequestBody user: User,
    ): UserDto {
        return userService.editUser(userOwner, user)
    }


    @DeleteMapping(path = ["/user/edit"])
    fun deleteUser(
        @AuthenticationPrincipal userOwner: User,
    ): UserDto {
        return userService.deleteUser(userOwner)
    }


    @PostMapping(path = ["/user/edit/password"])
    fun postPassword(
        @AuthenticationPrincipal userOwner: User,
        @RequestBody passwordChangeDto: PasswordChangeDto,
    ): UserDto {
        return userService.editPassword(userOwner, passwordChangeDto)
    }
}