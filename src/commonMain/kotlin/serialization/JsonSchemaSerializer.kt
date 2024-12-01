package com.xemantic.ai.tool.schema.serialization

import com.xemantic.ai.tool.schema.BaseSchema
import com.xemantic.ai.tool.schema.JsonSchema
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.PolymorphicKind
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

public object JsonSchemaSerializer : KSerializer<JsonSchema> {

  @OptIn(ExperimentalSerializationApi::class, InternalSerializationApi::class)
  override val descriptor: SerialDescriptor = buildSerialDescriptor(
    serialName = "JsonSchema",
    kind = PolymorphicKind.SEALED
  )

  override fun serialize(encoder: Encoder, value: JsonSchema) {
    when (value) {
      is JsonSchema.Ref -> {
        encoder.encodeSerializableValue(
          serializer = JsonObject.serializer(),
          value = buildJsonObject {
            put("\$ref", JsonPrimitive(value.ref))
          }
        )
      }
      is BaseSchema -> encoder.encodeSerializableValue(
        serializer = BaseSchema.serializer(),
        value = value
      )
    }
  }

  override fun deserialize(decoder: Decoder): JsonSchema {
    val input = decoder as? JsonDecoder ?: throw SerializationException(
      "Can be used only with Json format"
    )
    val tree = input.decodeJsonElement()
    val json = tree.jsonObject
    val ref = json["\$ref"]
    return if (ref != null) {
      JsonSchema.Ref(ref.jsonPrimitive.content)
    } else {
      input.json.decodeFromJsonElement(BaseSchema.serializer(), tree)
    }
  }

}