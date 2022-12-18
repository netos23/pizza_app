package ru.fbtw.pizzaapp.controller

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RestController
import ru.fbtw.pizzaapp.domain.User
import ru.fbtw.pizzaapp.dto.UserDto
import ru.fbtw.pizzaapp.dto.UserLoginDto
import ru.fbtw.pizzaapp.dto.UserRegistrationDto
import ru.fbtw.pizzaapp.service.UserService

@RestController
class UserController(
    private val userService: UserService,
) {

    @PostMapping(path = ["/user/"])
    fun postUser(
        @RequestBody userLoginDto: UserLoginDto,
    ): UserDto {
        return userService.login(userLoginDto)
    }


    @GetMapping(path = ["/user/"])
    fun getUser(
        @AuthenticationPrincipal user: User,
    ): UserDto {
        return userService.getUser(user.username)
    }


    @GetMapping(path = ["/user/validate"])
    fun validateToken(
        @RequestHeader accessToken: String,
    ): UserDto {
        return userService.validate(accessToken)
    }


    @GetMapping(path = ["/user/refresh"])
    fun refreshToken(
        @RequestHeader refreshToken: String,
    ): UserDto {
        return userService.refresh(refreshToken)
    }


    @GetMapping(path = ["/user/logout"])
    fun postLogout(
        @AuthenticationPrincipal user: User,
    ): UserDto {
        return userService.deleteTokens(user)
    }

    @GetMapping(path = ["/user/registration"])
    fun postRegistration(
        @AuthenticationPrincipal userRegistrationDto: UserRegistrationDto,
    ): UserDto {
        return userService.register(userRegistrationDto)
    }


    @GetMapping(path = ["/users/"])
    fun getUserList(
        @AuthenticationPrincipal user: User,
    ): List<UserDto> {
        return userService.getUsers(user)
    }
}