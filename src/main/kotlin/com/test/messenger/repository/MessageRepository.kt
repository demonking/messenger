package com.test.messenger.repository

import com.test.messenger.data.Message
import org.springframework.data.mongodb.repository.MongoRepository

interface MessageRepository : MongoRepository<Message, String>{
    fun findBySenderId(senderId: String): List<Message>
    fun findByReceiverId(receiverId: String): List<Message>
}

