package com.paklog.equipment.domain.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.paklog.equipment.domain.aggregate.*;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.*;

@Service public class PredictiveMaintenanceService {
    private static final Logger log = LoggerFactory.getLogger(PredictiveMaintenanceService.class);

    
    public FailurePrediction predictFailure(Asset asset) {
        double probability = calculateFailureProbability(asset);
        
        if (probability > 0.7) {
            Instant predictedDate = Instant.now().plus(30, ChronoUnit.DAYS);
            
            return FailurePrediction.builder()
                    .predictionId(UUID.randomUUID().toString())
                    .assetId(asset.getAssetId())
                    .failureType("Component Wear")
                    .probability(probability)
                    .predictedFailureDate(predictedDate)
                    .recommendation("Schedule preventive maintenance within 30 days")
                    .generatedAt(Instant.now())
                    .actionTaken(false)
                    .build();
        }
        
        return null;
    }
    
    private double calculateFailureProbability(Asset asset) {
        double ageFactor = asset.getTotalOperatingHours() / 10000.0;
        double utilizationFactor = asset.getUtilizationPercentage() / 100.0;
        return Math.min(ageFactor * utilizationFactor * 1.2, 1.0);
    }
}
