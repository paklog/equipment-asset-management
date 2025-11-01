package com.paklog.equipment.domain.aggregate;
import com.paklog.equipment.domain.valueobject.MaintenanceType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;
@Document(collection = "maintenance_schedules")
public class MaintenanceSchedule {
 @Id private String scheduleId;
 private String assetId;
 private MaintenanceType type;
 private Instant scheduledDate;
 private int intervalDays;
 private String description;
 private String assignedTo;
 private boolean completed;
 private Instant completedDate;

 // Getters
 public String getAssetId() { return assetId; }
 public MaintenanceType getType() { return type; }
 public Instant getScheduledDate() { return scheduledDate; }
 public int getIntervalDays() { return intervalDays; }
 public String getDescription() { return description; }
 public String getAssignedTo() { return assignedTo; }
 public boolean isCompleted() { return completed; }
 public Instant getCompletedDate() { return completedDate; }

 // Setters
 public void setAssetId(String assetId) { this.assetId = assetId; }
 public void setType(MaintenanceType type) { this.type = type; }
 public void setScheduledDate(Instant scheduledDate) { this.scheduledDate = scheduledDate; }
 public void setIntervalDays(int intervalDays) { this.intervalDays = intervalDays; }
 public void setDescription(String description) { this.description = description; }
 public void setAssignedTo(String assignedTo) { this.assignedTo = assignedTo; }
 public void setCompleted(boolean completed) { this.completed = completed; }
 public void setCompletedDate(Instant completedDate) { this.completedDate = completedDate; }
}
