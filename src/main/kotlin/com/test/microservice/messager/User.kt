package com.test.microservice.messager

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("User")
data class User(
    @Id
    val id: ObjectId = ObjectId(),
    val name: String,
    val email: String
)
