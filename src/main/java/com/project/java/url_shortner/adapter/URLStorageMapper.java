package com.project.java.url_shortner.adapter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.project.java.url_shortner.entitiy.URLStorageEntity;
import com.project.java.url_shortner.models.TinyURLRequest;

@Mapper(componentModel = "spring")
public interface URLStorageMapper {

    @Mapping(target = "urlid", source = "shortId")
    @Mapping(target = "originalURL", source = "request.url")
    @Mapping(target = "ipAddress", source = "request.ipAddress")
    @Mapping(target = "createdDate", expression = "java(java.time.LocalDateTime.now().toString())")
    @Mapping(target = "expiryDate", expression = "java(java.time.LocalDate.now().plusDays(30).toString())")
    @Mapping(target = "noOfClicks", constant = "0")
    @Mapping(target = "status", constant = "ACTIVE")
    @Mapping(target = "shortenedURL", expression = "java(baseUrl + shortId)")
    URLStorageEntity adaptNewUrlFromRequest(TinyURLRequest request, String shortId, String baseUrl);
}
