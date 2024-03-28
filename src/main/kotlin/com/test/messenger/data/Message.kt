package com.test.messenger.data

import org.bson.types.ObjectId
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document("messages")
data class Message(
    val id: ObjectId,
    val text: String,
    val sender: User,
    val receiver: User,
    var sendDate: Date = Date(),
)
