package com.johngunnarsson.parking.controller;

import com.johngunnarsson.parking.models.Parking;
import com.johngunnarsson.parking.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/parkings")
public class ParkingController {
    private final ParkingService parkingService;

    @Autowired
    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @GetMapping
    public List<Parking> getAllParkings() {
        return parkingService.getAllParkings();
    }

    @GetMapping("/{id}")
    public Optional<Parking> getParkingById(@PathVariable String id) {
        return parkingService.getParkingById(id);
    }

    @PostMapping("/create")
    public Parking createParking(@RequestBody Parking parking) {
        return parkingService.saveParking(parking);
    }

    @PostMapping("/bulk")
    public List<Parking> createMany(@RequestBody List<Parking> parkings) {
        return parkingService.saveAllParkings(parkings);
    }

    @DeleteMapping("/{id}")
    public void deleteParking(@PathVariable String id) {
        parkingService.deleteParkingById(id);
    }

    @DeleteMapping
    public void deleteAll() {
        parkingService.deleteAllParkings();
    }
}
