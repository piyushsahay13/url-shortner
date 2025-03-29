package com.project.java.url_shortner.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginRequest {
     @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;

    @JsonProperty("recaptcha_token")
    private String recaptchaToken;

    @JsonProperty("errors")
    private Errors errors;

}
