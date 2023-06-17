package com.ecomos.coreconfig.repository;

import com.ecomos.coreconfig.entities.Image;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends MongoRepository<Image, String> {
}
