package dev.vvr.astrosentinel.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.vvr.astrosentinel.deserializer.EpochDeserializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.Instant;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
public class TLEData {
    @JsonProperty("OBJECT_NAME")
    private String objectName;

    @JsonProperty("NORAD_CAT_ID")
    private Long noradCatId;

    @JsonProperty("EPOCH")
    @JsonDeserialize(using = EpochDeserializer.class)
    private Instant epoch;

    @JsonProperty("TLE_LINE1")
    private String tleLine1;

    @JsonProperty("TLE_LINE2")
    private String tleLine2;

}
