package com.project.java.url_shortner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.java.url_shortner.models.TinyURLRequest;
import com.project.java.url_shortner.models.TinyURLResponse;
import com.project.java.url_shortner.service.URLShortnerServiceImpl;

import jakarta.websocket.server.PathParam;


@RestController
@RequestMapping("/shortner")
public class URLShortnerController {
    
    @Autowired
    private URLShortnerServiceImpl urlShortnerService;

    @PostMapping("/shorten")
    public ResponseEntity<TinyURLResponse> shortenURL(@RequestBody TinyURLRequest request) {
        return ResponseEntity.ok(urlShortnerService.shortenURL(request));
    }

    @GetMapping()
    public ResponseEntity<String> expandURL(@RequestParam String url) {
        String expandedURL = urlShortnerService.expandURL(url);
        return ResponseEntity.ok(expandedURL);
    }
}
