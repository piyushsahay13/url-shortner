package com.project.java.url_shortner.entitiy;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class URLStorageEntity {
    prigit vate String urlId;
    private String originalURL;
    private String shortenedURL;
    private String createdDate;
    private String expiryDate;
    private String status;
    private String ipAddress;
    private String noOfClicks;
    private String lastAccessedDate;
    private String lastAccessedIP;
    private String qrCode;
    private String description;
    private String tags;
    private String createdBy;
}
