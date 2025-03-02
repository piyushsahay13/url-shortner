package com.project.java.url_shortner.strategy;

import java.net.URI;

public interface URLExpandStrategy {
    
        /**
     * Expands the given shortened URL to its original form.
     *
     * @param url the shortened URL to be expanded
     * @return the original URL
     */
    URI expandURL(String url);
}
