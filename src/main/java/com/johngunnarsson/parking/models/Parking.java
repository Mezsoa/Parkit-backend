package com.johngunnarsson.parking.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Document(collection = "parkings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Parking {
    @Id
    private String id; // Unikt ID, t.ex. från API:t
    private String name;
    private String owner;
    private int parkingSpaces;
    private int parkingSpaceCount;
    private String phoneParkingCode;
    private String parkingCharge;
    private String parkingCost;
    private String currentParkingCost;
    private String maxParkingTime;
    private String maxParkingTimeLimitation;
    private String residentialParkingArea;
    private String extraInfo;
    private double lat;
    private double longitude;
}
