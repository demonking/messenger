package com.test.messenger.data

import org.bson.types.ObjectId
import org.springframework.data.mongodb.core.mapping.Document

@Document("users")
data class User(
    var id: ObjectId,
    val name: String,
    val email: String,
)
