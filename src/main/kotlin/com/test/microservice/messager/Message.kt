package com.test.microservice.messager

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("Message")
data class Message(
    @Id
    val id: ObjectId = ObjectId(),
    val text: String,
    val senderId: String,
    val sender: User,
    val receiver: User
)
