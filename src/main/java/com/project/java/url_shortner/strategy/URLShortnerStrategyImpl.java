package com.project.java.url_shortner.strategy;

import java.security.SecureRandom;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.project.java.url_shortner.adapter.URLStorageMapper;
import com.project.java.url_shortner.entitiy.URLStorageEntity;
import com.project.java.url_shortner.models.TinyURLRequest;
import com.project.java.url_shortner.models.TinyURLResponse;
import com.project.java.url_shortner.repositories.URLStorageEntitiyRepository;

@Service
@PropertySource("classpath:application.properties")
public class URLShortnerStrategyImpl implements URLShortnerStrategy {
    @Value("${urlShortner.baseUrl}")
    String baseUrl;
    private URLStorageEntitiyRepository urlStorageEntitiyRepository;
    private URLStorageMapper urlStorageMapper;
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int LENGTH = 8;
    private static final SecureRandom RANDOM = new SecureRandom();

    public URLShortnerStrategyImpl(URLStorageEntitiyRepository urlStorageEntitiyRepository,URLStorageMapper urlStorageMapper) {
        this.urlStorageEntitiyRepository = urlStorageEntitiyRepository;
        this.urlStorageMapper = urlStorageMapper;
    }


    @Override
    public TinyURLResponse shortenURL(TinyURLRequest request) {
        String shortId = generateShortId();
        URLStorageEntity urlStorageEntity = urlStorageMapper.adaptNewUrlFromRequest(request, shortId, baseUrl);
        urlStorageEntitiyRepository.save(urlStorageEntity);
        return new TinyURLResponse(urlStorageEntity.getShortenedURL());
    }

    private String generateShortId() {
            StringBuilder shortUrl = new StringBuilder(LENGTH);
            for (int i = 0; i < LENGTH; i++) {
                shortUrl.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
            }
            return shortUrl.toString();
        }
}
