package com.example.androidkotlin.domain.usecase

import com.example.androidkotlin.data.repository.UserRepository
import com.example.androidkotlin.domain.entity.User


class CreateUserUseCase(
    private val userRepository: UserRepository
) {
    suspend fun invoke(user: User){
        userRepository.createUser(user)
    }
}