package com.test.messenger.utils

import com.test.messenger.data.User
import com.test.messenger.repository.UserRepository
import org.bson.types.ObjectId
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DefaultUserLoader @Autowired constructor(private val userRepository: UserRepository) :CommandLineRunner {
    override fun run( vararg args: String? ) {
        if(userRepository.count() == 0L) {
            userRepository.save(User(ObjectId(),"Smith","smith@example.com"))
            userRepository.save(User(ObjectId(),"John","john@example.com"))
        }
    }
}