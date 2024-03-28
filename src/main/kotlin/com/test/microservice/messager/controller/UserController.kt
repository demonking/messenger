package com.test.microservice.messager.controller

import com.test.microservice.messager.data.User
import org.bson.types.ObjectId
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
    @GetMapping("/user")
    fun index(): List<User> = listOf(
        User(ObjectId(), "John", "john@example.com"),
        User(ObjectId(),"smith","smith@example.com"),
    )
}