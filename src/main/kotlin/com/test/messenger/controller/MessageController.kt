package com.test.messenger.controller

import com.test.messenger.data.Message
import com.test.messenger.data.User
import com.test.messenger.repository.MessageRepository
import org.bson.types.ObjectId
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody


@RestController
class MessageController(private val messageRepository: MessageRepository) {
    @GetMapping("/message")
    fun index(): List<Message> {
        val john: User = User(ObjectId(), "John", "john@example.com");
        val smith: User = User(ObjectId(), "smith", "smith@example.com");

        return listOf(
            Message(ObjectId(), "Hello John", smith, john),
            Message(ObjectId(), "Hello Smith", john, smith),
            Message(ObjectId(), "How are you doing?", smith, john),
            Message(ObjectId(), "I'm doing fine", john, smith),
            Message(ObjectId(), "Have a nice day", john, smith)
        )
    }

    @PostMapping("/message")
    fun post(@RequestBody message: Message): Message {
        return message
    }
}