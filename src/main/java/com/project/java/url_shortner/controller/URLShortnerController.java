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
import com.project.java.url_shortner.service.TinyURLService;

import org.springframework.web.bind.annotation.PathVariable;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class URLShortnerController {

    private TinyURLService tinyURLService;
    
    public URLShortnerController(TinyURLService tinyURLService) {
        this.tinyURLService = tinyURLService;
    }

    @PostMapping("/shorten")
    public ResponseEntity<TinyURLResponse> shortenURL(@RequestBody TinyURLRequest request) {
        log.info("Recevied request " + request);
        return ResponseEntity.ok(tinyURLService.shortenURL(request));
    }

    @GetMapping("/{url}")
    public ResponseEntity<Void> expandURL(@PathVariable("url") String url) {
        log.info("Recevied request to expand URL " + url);
        return ResponseEntity.status(302).location(tinyURLService.expandURL(url)).build();
    }

}
