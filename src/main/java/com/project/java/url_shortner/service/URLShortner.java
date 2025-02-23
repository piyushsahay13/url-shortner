package com.project.java.url_shortner.service;


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
    String shortenURL(String url);

    /**
     * Expands the given shortened URL to its original form.
     *
     * @param url the shortened URL to be expanded
     * @return the original URL
     */
    String expandURL(String url);

}
