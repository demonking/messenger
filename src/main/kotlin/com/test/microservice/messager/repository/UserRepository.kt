package com.test.microservice.messager.repository

import com.test.microservice.messager.data.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<User, String> {
    fun findByEmail(email: String): User?

}
