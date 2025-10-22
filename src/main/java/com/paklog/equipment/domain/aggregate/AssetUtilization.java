package com.paklog.equipment.domain.aggregate;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Document(collection = "asset_utilization")
public class AssetUtilization {
    @Id private String utilizationId;
    private String assetId;
    private LocalDate date;
    private int operatingHours;
    private int idleHours;
    private int maintenanceHours;
    private double utilizationPercentage;
    private int cyclesCompleted;
}
