package com.project.java.url_shortner.models;

import java.util.Map;

import jakarta.annotation.Nonnull;
import lombok.Data;

@Data
public class User {
    @Nonnull
    private String userId;
    @Nonnull
    private String password;
    private String lastLogin;
    private String firstName;
    private String surname;
    @Nonnull
    private String email;
    Map<String, String> urlMap;
    
}
