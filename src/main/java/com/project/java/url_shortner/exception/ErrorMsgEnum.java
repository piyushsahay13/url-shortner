package com.project.java.url_shortner.exception;

import org.springframework.http.HttpStatus;

public enum ErrorMsgEnum {
    
    URL_NOT_FOUND("URL_NOT_FOUND", "The requested short URL was not found", HttpStatus.NOT_FOUND),
    INVALID_URL("INVALID_URL", "The provided URL is not valid", HttpStatus.BAD_REQUEST),
    SERVER_ERROR("SERVER_ERROR", "An unexpected error occurred", HttpStatus.INTERNAL_SERVER_ERROR),
    VALIDATION_ERROR("VALIDATION_ERROR", "Invalid request :: ", HttpStatus.INTERNAL_SERVER_ERROR);
    
    private final String shortName;
    private final String description;
    private final HttpStatus httpStatus;
    
    ErrorMsgEnum(String shortName, String description, HttpStatus httpStatus) {
        this.shortName = shortName;
        this.description = description;
        this.httpStatus = httpStatus;
    }
    
    public String getShortName() {
        return shortName;
    }
    
    public String getDescription() {
        return description;
    }
    
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
