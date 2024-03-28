package com.test.microservice.messager.service

import com.test.microservice.messager.data.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate

class UserService @Autowired constructor(private val db:MongoTemplate) {
    fun getAllUsers(): List<User> {
        return db.findAll(User::class.java)
    }

    fun saveUser(user: User): User {
        return db.save(user)
    }
}