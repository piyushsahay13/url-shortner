package com.project.java.url_shortner.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Nonnull;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TinyURLRequest {
    @Nonnull()
    @JsonProperty("URL")
    private String url;

    @JsonProperty("IPAddress")
    private String ipAddress;

}
