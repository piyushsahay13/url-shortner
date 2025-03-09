package com.project.java.url_shortner.service;

import java.net.URI;

import org.springframework.stereotype.Service;

import com.project.java.url_shortner.models.TinyURLRequest;
import com.project.java.url_shortner.models.TinyURLResponse;
import com.project.java.url_shortner.strategy.URLExpandStrategyImpl;
import com.project.java.url_shortner.strategy.URLShortnerStrategyImpl;
import com.project.java.url_shortner.utility.UrlShortnerValidator;

@Service
public class TinyURLService {
    
    private URLShortnerStrategyImpl urlShortnerService;
    private URLExpandStrategyImpl urlExpandService;
    
    public TinyURLService(URLShortnerStrategyImpl urlShortnerService, URLExpandStrategyImpl urlExpandService) {
        this.urlShortnerService = urlShortnerService;
        this.urlExpandService = urlExpandService;
    }

    public TinyURLResponse shortenURL(TinyURLRequest request) {
        UrlShortnerValidator.validateRequest(request);
        return urlShortnerService.shortenURL(request);
    }

    public URI expandURL(String url) {
        return urlExpandService.expandURL(url);
    }
}
