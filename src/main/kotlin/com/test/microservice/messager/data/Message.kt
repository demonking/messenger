package com.test.microservice.messager.data

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.Date

@Document("Message")
data class Message(
    @Id
    val id: ObjectId = ObjectId(),
    val text: String,
    val sender: User,
    val receiver: User,
    var sendDate: Date = Date(),

)
