package com.johngunnarsson.parking.repositories;

import com.johngunnarsson.parking.models.Parking;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepository extends MongoRepository<Parking, String> {

}
