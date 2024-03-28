package com.test.messenger.controller

import com.test.messenger.data.User
import com.test.messenger.service.UserService
import org.bson.types.ObjectId
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val service: UserService) {
    @GetMapping("/user")
    fun index(): List<User> = service.getAllUsers()

    @GetMapping("/user/{id}")
    fun index(@PathVariable id:String ): User? = service.getById(id)
}