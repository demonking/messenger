package com.test.microservice.messager.controller

import com.test.microservice.messager.data.Message
import com.test.microservice.messager.data.User
import org.bson.types.ObjectId
import org.springframework.web.bind.annotation.*

@RestController
class MessageController {
    @GetMapping("/message")
    fun index(@RequestParam name:String): List<Message> {
        val john:User = User(ObjectId(), "John", "john@example.com");
        val smith:User = User(ObjectId(),"smith","smith@example.com");

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