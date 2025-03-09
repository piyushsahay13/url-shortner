package com.project.java.url_shortner.utility;

import com.project.java.url_shortner.exception.ErrorMsgEnum;
import com.project.java.url_shortner.exception.UrlShortnerException;
import com.project.java.url_shortner.models.TinyURLRequest;

public class UrlShortnerValidator {

    private UrlShortnerValidator() {}
    
    public static void validateRequest(TinyURLRequest request) {
        if (request == null) {
            throw new UrlShortnerException(ErrorMsgEnum.VALIDATION_ERROR,"Request cannot be null");
        }
        if (request.getUrl().isEmpty() || validateUrl(request.getUrl())) {
            throw new UrlShortnerException(ErrorMsgEnum.VALIDATION_ERROR,"URL is not valid or empty :: " +request.getUrl());
        }
    }

    public static boolean validateUrl(String url) {
        return !url.matches("^(http|https)://.*$");
    }
}
