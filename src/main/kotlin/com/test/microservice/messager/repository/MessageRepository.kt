package com.test.microservice.messager.repository

import com.test.microservice.messager.data.Message
import org.springframework.data.mongodb.repository.MongoRepository

interface MessageRepository : MongoRepository<Message, String>{
    fun findBySenderId(senderId: String): List<Message>
    fun findByReceiverId(receiverId: String): List<Message>
}

