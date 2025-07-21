package com.johngunnarsson.parking.service;
import com.johngunnarsson.parking.models.Parking;
import com.johngunnarsson.parking.repositories.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ParkingService {

    @Autowired
    private ParkingRepository parkingRepository;

    public List<Parking> getAllParkings() {
        return parkingRepository.findAll();
    }

    public Optional<Parking> getParkingById(String id) {
        return parkingRepository.findById(id);
    }

    public Parking saveParking(Parking parking) {
        return parkingRepository.save(parking);
    }

    public List<Parking> saveAllParkings(List<Parking> parkings) {
        return parkingRepository.saveAll(parkings);
    }

    public void deleteParkingById(String id) {
        parkingRepository.deleteById(id);
    }

    public void deleteAllParkings() {
        parkingRepository.deleteAll();
    }

    public boolean existsById(String id) {
        return parkingRepository.existsById(id);
    }

}
