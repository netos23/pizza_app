package ru.fbtw.pizzaapp.service

import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import ru.fbtw.pizzaapp.domain.User
import ru.fbtw.pizzaapp.dto.PasswordChangeDto
import ru.fbtw.pizzaapp.dto.UserDto
import ru.fbtw.pizzaapp.dto.UserLoginDto
import ru.fbtw.pizzaapp.dto.UserRegistrationDto
import ru.fbtw.pizzaapp.repository.UserRepository

@Service
class UserService(
    private val userRepository: UserRepository,
) : UserDetailsService {

    override fun loadUserByUsername(username: String?): UserDetails {
        return username!!.let(userRepository::findByEmail)
    }

    fun login(userLoginDto: UserLoginDto): UserDto {
        TODO("Not yet implemented")
    }

    fun getUser(username: String): UserDto {
        TODO("Not yet implemented")
    }

    fun getUsers(username: User): List<UserDto> {
        TODO("Not yet implemented")
    }

    fun register(userRegistrationDto: UserRegistrationDto): UserDto {
        TODO("Not yet implemented")
    }

    fun deleteTokens(user: User): UserDto {
        TODO("Not yet implemented")
    }

    fun refresh(refreshToken: String): UserDto {
        TODO("Not yet implemented")
    }

    fun validate(accessToken: String): UserDto {
        TODO("Not yet implemented")
    }

    fun editUser(username: User, user: User): UserDto {
        TODO("Not yet implemented")
    }

    fun editPassword(userOwner: User, passwordChangeDto: PasswordChangeDto): UserDto {
        TODO("Not yet implemented")
    }

    fun deleteUser(userOwner: User): UserDto {
        TODO("Not yet implemented")
    }

}