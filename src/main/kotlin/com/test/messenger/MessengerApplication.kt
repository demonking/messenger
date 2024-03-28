package com.test.messenger

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.module.SimpleModule
import com.test.messenger.serializer.CustomObjectIdSerializer
import org.bson.types.ObjectId
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration



@Configuration
class JacksonConfig {

	@Bean
	fun customObjectIdSerializer(): CustomObjectIdSerializer {
		return CustomObjectIdSerializer()
	}
	@Bean
	fun objectMapper(customObjectIdSerializer: CustomObjectIdSerializer): ObjectMapper {
		val objectMapper = ObjectMapper()
		val module = SimpleModule()
		// register the serializer for ObjectId Objects
		module.addSerializer(ObjectId::class.java, customObjectIdSerializer)
		objectMapper.registerModule(module)
		return objectMapper
	}
}
@SpringBootApplication
class MessengerApplication

fun main(args: Array<String>) {
	runApplication<MessengerApplication>(*args)
}



