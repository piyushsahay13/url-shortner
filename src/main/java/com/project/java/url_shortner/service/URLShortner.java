package com.project.java.url_shortner.service;

import com.project.java.url_shortner.models.TinyURLRequest;
import com.project.java.url_shortner.models.TinyURLResponse;

/**
 * Service interface for URL shortening and expanding operations.
 */
public interface URLShortner {

    /**
     * Shortens the given URL.
     *
     * @param url the original URL to be shortened
     * @return the shortened URL
     */
    TinyURLResponse shortenURL(TinyURLRequest request);

    /**
     * Expands the given shortened URL to its original form.
     *
     * @param url the shortened URL to be expanded
     * @return the original URL
     */
    String expandURL(String url);

}
