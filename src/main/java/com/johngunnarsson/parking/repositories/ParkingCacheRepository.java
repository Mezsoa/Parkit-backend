package com.johngunnarsson.parking.repositories;

import com.johngunnarsson.parking.models.ParkingCache;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingCacheRepository extends MongoRepository<ParkingCache, String> {
}
