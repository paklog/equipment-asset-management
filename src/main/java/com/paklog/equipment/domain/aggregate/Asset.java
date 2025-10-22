package com.paklog.equipment.domain.aggregate;
import com.paklog.equipment.domain.valueobject.*;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;
import java.time.LocalDate;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Document(collection = "assets")
public class Asset {
    @Id private String assetId;
    private String serialNumber;
    private String name;
    private AssetType type;
    private AssetStatus status;
    private String manufacturer;
    private String model;
    private LocalDate purchaseDate;
    private LocalDate warrantyExpiryDate;
    private double purchaseCost;
    private double currentValue;
    private String location;
    private Instant lastMaintenanceDate;
    private Instant nextMaintenanceDate;
    private int totalOperatingHours;
    private double utilizationPercentage;
}
