package com.johngunnarsson.parking.repositories;

import com.johngunnarsson.parking.models.FavoriteParking;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoriteParkingRepository extends MongoRepository<FavoriteParking, String> {
    List<FavoriteParking> findByUserId(String userId);
    boolean existsByUserIdAndParkingId(String userId, String parkingId);
}
