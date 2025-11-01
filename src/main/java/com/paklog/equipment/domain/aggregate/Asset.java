package com.paklog.equipment.domain.aggregate;
import com.paklog.equipment.domain.valueobject.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;
import java.time.LocalDate;
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

 // Getters
 public String getSerialNumber() { return serialNumber; }
 public String getName() { return name; }
 public AssetType getType() { return type; }
 public AssetStatus getStatus() { return status; }
 public String getManufacturer() { return manufacturer; }
 public String getModel() { return model; }
 public LocalDate getPurchaseDate() { return purchaseDate; }
 public LocalDate getWarrantyExpiryDate() { return warrantyExpiryDate; }
 public double getPurchaseCost() { return purchaseCost; }
 public double getCurrentValue() { return currentValue; }
 public String getLocation() { return location; }
 public Instant getLastMaintenanceDate() { return lastMaintenanceDate; }
 public Instant getNextMaintenanceDate() { return nextMaintenanceDate; }
 public int getTotalOperatingHours() { return totalOperatingHours; }
 public double getUtilizationPercentage() { return utilizationPercentage; }

 // Setters
 public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber; }
 public void setName(String name) { this.name = name; }
 public void setType(AssetType type) { this.type = type; }
 public void setStatus(AssetStatus status) { this.status = status; }
 public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
 public void setModel(String model) { this.model = model; }
 public void setPurchaseDate(LocalDate purchaseDate) { this.purchaseDate = purchaseDate; }
 public void setWarrantyExpiryDate(LocalDate warrantyExpiryDate) { this.warrantyExpiryDate = warrantyExpiryDate; }
 public void setPurchaseCost(double purchaseCost) { this.purchaseCost = purchaseCost; }
 public void setCurrentValue(double currentValue) { this.currentValue = currentValue; }
 public void setLocation(String location) { this.location = location; }
 public void setLastMaintenanceDate(Instant lastMaintenanceDate) { this.lastMaintenanceDate = lastMaintenanceDate; }
 public void setNextMaintenanceDate(Instant nextMaintenanceDate) { this.nextMaintenanceDate = nextMaintenanceDate; }
 public void setTotalOperatingHours(int totalOperatingHours) { this.totalOperatingHours = totalOperatingHours; }
 public void setUtilizationPercentage(double utilizationPercentage) { this.utilizationPercentage = utilizationPercentage; }
}
