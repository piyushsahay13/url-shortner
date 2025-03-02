package com.project.java.url_shortner.service;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.project.java.url_shortner.models.TinyURLRequest;
import com.project.java.url_shortner.strategy.URLExpandStrategyImpl;
import com.project.java.url_shortner.strategy.URLShortnerStrategyImpl;

@Service
public class TinyURLService {
    
    private URLShortnerStrategyImpl urlShortnerService;
    private URLExpandStrategyImpl urlExpandService;
    
    public TinyURLService(URLShortnerStrategyImpl urlShortnerService, URLExpandStrategyImpl urlExpandService) {
        this.urlShortnerService = urlShortnerService;
        this.urlExpandService = urlExpandService;
    }

    public String shortenURL(TinyURLRequest request) {
        return "shortenedURL";
    }

    public URI expandURL(String url) {
        return urlExpandService.expandURL(url);
    }
}
