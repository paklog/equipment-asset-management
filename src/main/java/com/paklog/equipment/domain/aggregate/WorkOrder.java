package com.paklog.equipment.domain.aggregate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;
@Document(collection = "work_orders")
public class WorkOrder {
 @Id private String workOrderId;
 private String assetId;
 private String title;
 private String description;
 private String priority;
 private String assignedTo;
 private String status;
 private Instant createdAt;
 private Instant completedAt;
 private double laborCost;
 private double partsCost;
 private String resolution;

 // Getters
 public String getAssetId() { return assetId; }
 public String getTitle() { return title; }
 public String getDescription() { return description; }
 public String getPriority() { return priority; }
 public String getAssignedTo() { return assignedTo; }
 public String getStatus() { return status; }
 public Instant getCreatedAt() { return createdAt; }
 public Instant getCompletedAt() { return completedAt; }
 public double getLaborCost() { return laborCost; }
 public double getPartsCost() { return partsCost; }
 public String getResolution() { return resolution; }

 // Setters
 public void setAssetId(String assetId) { this.assetId = assetId; }
 public void setTitle(String title) { this.title = title; }
 public void setDescription(String description) { this.description = description; }
 public void setPriority(String priority) { this.priority = priority; }
 public void setAssignedTo(String assignedTo) { this.assignedTo = assignedTo; }
 public void setStatus(String status) { this.status = status; }
 public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
 public void setCompletedAt(Instant completedAt) { this.completedAt = completedAt; }
 public void setLaborCost(double laborCost) { this.laborCost = laborCost; }
 public void setPartsCost(double partsCost) { this.partsCost = partsCost; }
 public void setResolution(String resolution) { this.resolution = resolution; }
}
