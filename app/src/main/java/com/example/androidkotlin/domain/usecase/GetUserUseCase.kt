package com.example.androidkotlin.domain.usecase

import com.example.androidkotlin.data.repository.UserRepository
import com.example.androidkotlin.domain.entity.User


class GetUserUseCase(
    private val userRepository: UserRepository
) {
    suspend fun invoke(email: String) : User? {
        return userRepository.getUser(email)
    }
}