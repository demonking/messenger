package com.test.messenger.serializer

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import org.bson.types.ObjectId

class CustomObjectIdSerializer : JsonSerializer<ObjectId>() {
    override fun serialize(objectId: ObjectId?, gen: JsonGenerator?, serializers: SerializerProvider?) {
        if (objectId != null && gen != null) {
            gen.writeString(objectId.toHexString())
        }
    }
}