package com.test.microservice.messager

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MessengerController {
    @GetMapping("/")
    fun index(@RequestParam name:String): List<Message> {
        val john: User = User("1", "John", "john@example.com");
        val smith:User = User("2", "Smith", "smith@example.com");

        return listOf(
            Message("1", "Hello John", smith, john),
            Message("2", "Hello Smith", john, smith),
            Message("3", "How are you doing?", smith, john),
            Message("4", "I'm doing fine", john, smith),
            Message("5", "Have a nice day", john, smith)
        )
    }
}