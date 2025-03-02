package com.project.java.url_shortner.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.java.url_shortner.entitiy.URLStorageEntity;

@Repository
public interface URLStorageEntitiyRepository extends JpaRepository<URLStorageEntity, String> {
    
}
