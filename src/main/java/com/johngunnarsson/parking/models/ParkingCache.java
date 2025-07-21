package com.johngunnarsson.parking.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "parking_cache")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingCache {

    @Id
    private String id;
    private List<Parking> parkings;
    private LocalDateTime cachedAt;
}
