package com.project.java.url_shortner.strategy;

import java.net.URI;
import org.springframework.stereotype.Service;


@Service
public class URLExpandStrategyImpl implements URLExpandStrategy{
    /**
     * Expands the given shortened URL to its original form.
     *
     * @param url the shortened URL to be expanded
     * @return the original URL
     */    
    @Override
    public URI expandURL(String url) {

        return URI.create("expandedURL");
    }
    
}
