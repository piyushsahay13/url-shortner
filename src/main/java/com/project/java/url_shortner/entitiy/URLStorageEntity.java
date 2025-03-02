package com.project.java.url_shortner.entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.Data;

@Entity
@Data
@Table(name = "URLSTORAGE")
public class URLStorageEntity {
    @Id
    @Column(name = "URLID")
    private String urlid;
    @Column(name = "ORIGINALURL", nullable = false)
    private String originalURL;
    @Column(name = "SHORTURL", nullable = false, unique = true)
    private String shortenedURL;
    @Column(name = "CREATIONDATE", nullable = false)
    private String createdDate;
    @Column(name = "EXPIRYDATE")
    private String expiryDate;
    @Column(name = "STATUS", nullable = false)
    private String status;
    @Column(name = "IPADDRESS", nullable = false)
    private String ipAddress;
    @Column(name = "VISITS", nullable = false)
    private int noOfClicks;
    @Column(name = "LASTACCESSEDDATE")
    private String lastAccessedDate;
    @Column(name = "LASTACCESSEDIP")
    private String lastAccessedIP;
    @Column(name = "QRCODE")
    private String qrCode;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "TAGS")
    private String tags;
    @Column(name = "CREATEDBY")
    private String createdBy;
}
