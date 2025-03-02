package com.project.java.url_shortner.strategy;

import java.net.URI;

import org.springframework.stereotype.Service;
import com.project.java.url_shortner.models.TinyURLRequest;
import com.project.java.url_shortner.models.TinyURLResponse;

@Service
public class URLShortnerStrategyImpl implements URLShortnerStrategy {

    @Override
    public TinyURLResponse shortenURL(TinyURLRequest request) {

        return new TinyURLResponse("shortenedURL");
    }

}
