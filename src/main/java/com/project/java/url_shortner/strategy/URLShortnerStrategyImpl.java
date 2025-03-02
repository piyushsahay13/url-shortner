package com.project.java.url_shortner.strategy;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.project.java.url_shortner.entitiy.URLStorageEntity;
import com.project.java.url_shortner.models.TinyURLRequest;
import com.project.java.url_shortner.models.TinyURLResponse;
import com.project.java.url_shortner.repositories.URLStorageEntitiyRepository;

@Service
public class URLShortnerStrategyImpl implements URLShortnerStrategy {

    private URLStorageEntitiyRepository urlStorageEntitiyRepository;

    public URLShortnerStrategyImpl(URLStorageEntitiyRepository urlStorageEntitiyRepository) {
        this.urlStorageEntitiyRepository = urlStorageEntitiyRepository;
    }

    @Override
    public TinyURLResponse shortenURL(TinyURLRequest request) {
        URLStorageEntity urlStorageEntity = new URLStorageEntity();
        urlStorageEntity.setUrlid(UUID.randomUUID().toString()); 
        urlStorageEntity.setOriginalURL(request.getUrl());
        urlStorageEntity.setShortenedURL("shortenedURL");

        urlStorageEntitiyRepository.save(urlStorageEntity);
        return new TinyURLResponse("shortenedURL");
    }

}
