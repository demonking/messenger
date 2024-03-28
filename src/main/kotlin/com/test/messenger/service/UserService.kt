package com.test.messenger.service

import com.test.messenger.data.User
import com.test.messenger.repository.MessageRepository
import com.test.messenger.repository.UserRepository
import org.bson.types.ObjectId
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.stereotype.Service

@Service
class UserService @Autowired constructor(private val repository: UserRepository) {
    fun getAllUsers(): List<User> {
        return repository.findAll()
    }

    fun getById(id: String) :User? {
        return repository.findById(id).orElse(null)
    }
    fun saveUser(user: User): User {
        return repository.save(user)
    }
}