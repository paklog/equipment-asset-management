package com.paklog.equipment.domain.aggregate;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Document(collection = "failure_predictions")
public class FailurePrediction {
    @Id private String predictionId;
    private String assetId;
    private String failureType;
    private double probability;
    private Instant predictedFailureDate;
    private String recommendation;
    private Instant generatedAt;
    private boolean actionTaken;
}
