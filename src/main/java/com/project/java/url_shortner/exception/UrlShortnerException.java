package com.project.java.url_shortner.exception;

public class UrlShortnerException extends RuntimeException {

    public UrlShortnerException(ErrorMsgEnum error) {
        super(error.getShortName()+" : "+error.getDescription()+" : "+error.getHttpStatus());
    }

    public UrlShortnerException(ErrorMsgEnum error, Throwable cause) {
        super(error.getShortName()+" : "+error.getDescription()+ cause.getMessage()+" : "+error.getHttpStatus());
    }
    
    public UrlShortnerException(ErrorMsgEnum error, String msg) {
        super(error.getShortName()+" : "+error.getDescription()+ msg +" : "+error.getHttpStatus());
    }
}
