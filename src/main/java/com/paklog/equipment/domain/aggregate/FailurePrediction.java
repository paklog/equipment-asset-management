package com.paklog.equipment.domain.aggregate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;
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

 // Getters
 public String getAssetId() { return assetId; }
 public String getFailureType() { return failureType; }
 public double getProbability() { return probability; }
 public Instant getPredictedFailureDate() { return predictedFailureDate; }
 public String getRecommendation() { return recommendation; }
 public Instant getGeneratedAt() { return generatedAt; }
 public boolean isActionTaken() { return actionTaken; }

 // Setters
 public void setAssetId(String assetId) { this.assetId = assetId; }
 public void setFailureType(String failureType) { this.failureType = failureType; }
 public void setProbability(double probability) { this.probability = probability; }
 public void setPredictedFailureDate(Instant predictedFailureDate) { this.predictedFailureDate = predictedFailureDate; }
 public void setRecommendation(String recommendation) { this.recommendation = recommendation; }
 public void setGeneratedAt(Instant generatedAt) { this.generatedAt = generatedAt; }
 public void setActionTaken(boolean actionTaken) { this.actionTaken = actionTaken; }
}
