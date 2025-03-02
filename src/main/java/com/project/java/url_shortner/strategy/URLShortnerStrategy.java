package com.project.java.url_shortner.strategy;

import java.net.URI;

import com.project.java.url_shortner.models.TinyURLRequest;
import com.project.java.url_shortner.models.TinyURLResponse;

/**
 * Service interface for URL shortening and expanding operations.
 */
public interface URLShortnerStrategy {

    /**
     * Shortens the given URL.
     *
     * @param url the original URL to be shortened
     * @return the shortened URL
     */
    TinyURLResponse shortenURL(TinyURLRequest request);

}
