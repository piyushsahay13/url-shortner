package com.project.java.url_shortner.strategy;

import java.net.URI;

import java.util.Optional;
import org.springframework.stereotype.Service;

import com.project.java.url_shortner.entitiy.URLStorageEntity;
import com.project.java.url_shortner.exception.ErrorMsgEnum;
import com.project.java.url_shortner.exception.UrlShortnerException;
import com.project.java.url_shortner.repositories.URLStorageEntitiyRepository;


@Service
public class URLExpandStrategyImpl implements URLExpandStrategy{
    
    private URLStorageEntitiyRepository urlStorageEntitiyRepository;

    public URLExpandStrategyImpl(URLStorageEntitiyRepository urlStorageEntitiyRepository) {
        this.urlStorageEntitiyRepository = urlStorageEntitiyRepository;
    }
    
    /**
     * Expands the given shortened URL to its original form.
     *
     * @param url the shortened URL to be expanded
     * @return the original URL
     */    
    @Override
    public URI expandURL(String url) {
        Optional<URLStorageEntity> entity = urlStorageEntitiyRepository.findById(url);
        if(entity.isPresent()) {
            throw new UrlShortnerException(ErrorMsgEnum.URL_NOT_FOUND);
        }
        entity.get().setVisits(entity.get().getVisits() + 1);
        entity.get().setLastAccessedDate(java.time.LocalDateTime.now().toString());
        entity.get().setLastAccessedDate(java.time.LocalDateTime.now().toString());
        urlStorageEntitiyRepository.save(entity.get());
        return URI.create(entity.get().getOriginalURL());
    }
}
