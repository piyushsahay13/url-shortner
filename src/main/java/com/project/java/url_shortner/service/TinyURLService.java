package com.project.java.url_shortner.service;

import org.springframework.stereotype.Service;

@Service
public class TinyURLService {
    

    
    public String shortenURL(String url) {
        // Logic to shorten the URL
        return "shortenedURL";
    }

    public String expandURL(String url) {
        // Logic to expand the URL
        return "expandedURL";
    }
}
