package com.project.java.url_shortner.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.java.url_shortner.models.LoginRequest;
import com.project.java.url_shortner.models.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class UserController {
    
    public UserController() {}

    @PostMapping("/signUp")
    public ResponseEntity<String> shortenURL(@RequestBody User request) {
        log.info("Recevied request " + request);
        return ResponseEntity.ok("User Created");
    }

    @PostMapping("/login")
    public ResponseEntity<User> shortenURL(@RequestBody LoginRequest request) {
        log.info("Recevied request " + request);
        return ResponseEntity.ok(new User(null, null, null));
    }

}
