package dev.vvr.astrosentinel.deserializer;

import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonParser;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ValueDeserializer;
import tools.jackson.databind.deser.jackson.JsonNodeDeserializer;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class EpochDeserializer extends ValueDeserializer<Instant> {

    @Override
    public Instant deserialize(JsonParser p, DeserializationContext ctx) throws JacksonException {
        String rawData = p.getValueAsString();
        return LocalDateTime.parse(rawData).toInstant(ZoneOffset.UTC);
    }
}
