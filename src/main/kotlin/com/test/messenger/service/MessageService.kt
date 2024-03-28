package com.test.messenger.service

import com.test.messenger.data.Message
import com.test.messenger.repository.MessageRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MessageService @Autowired constructor(private val repository: MessageRepository) {
    fun getAllMessages(): List<Message> {
        return repository.findAll()
    }

    fun saveMessage(message: Message): Message {
        return repository.save(message)
    }
}
