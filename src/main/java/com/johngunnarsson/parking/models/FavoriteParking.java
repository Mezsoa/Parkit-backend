package com.johngunnarsson.parking.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "favoriteParkings")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FavoriteParking {

    @Id
    private String id;

    private String parkingId;
    private String userId; // tex e-post
    private String parkingName;

    private LocalDateTime addedAt;
}
