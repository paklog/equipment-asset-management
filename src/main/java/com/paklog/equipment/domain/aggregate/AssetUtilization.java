package com.paklog.equipment.domain.aggregate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;
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

 // Getters
 public String getAssetId() { return assetId; }
 public LocalDate getDate() { return date; }
 public int getOperatingHours() { return operatingHours; }
 public int getIdleHours() { return idleHours; }
 public int getMaintenanceHours() { return maintenanceHours; }
 public double getUtilizationPercentage() { return utilizationPercentage; }
 public int getCyclesCompleted() { return cyclesCompleted; }

 // Setters
 public void setAssetId(String assetId) { this.assetId = assetId; }
 public void setDate(LocalDate date) { this.date = date; }
 public void setOperatingHours(int operatingHours) { this.operatingHours = operatingHours; }
 public void setIdleHours(int idleHours) { this.idleHours = idleHours; }
 public void setMaintenanceHours(int maintenanceHours) { this.maintenanceHours = maintenanceHours; }
 public void setUtilizationPercentage(double utilizationPercentage) { this.utilizationPercentage = utilizationPercentage; }
 public void setCyclesCompleted(int cyclesCompleted) { this.cyclesCompleted = cyclesCompleted; }
}
