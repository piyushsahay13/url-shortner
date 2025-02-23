package com.project.java.url_shortner.service;

import org.springframework.stereotype.Service;
import com.project.java.url_shortner.models.TinyURLRequest;
import com.project.java.url_shortner.models.TinyURLResponse;

@Service
public class URLShortnerServiceImpl implements URLShortner {

    @Override
    public TinyURLResponse shortenURL(TinyURLRequest request) {

        return new TinyURLResponse("shortenedURL");
    }

    @Override
    public String expandURL(String url) {
        // Logic to expand the URL
        return "expandedURL";
    }
    
}
