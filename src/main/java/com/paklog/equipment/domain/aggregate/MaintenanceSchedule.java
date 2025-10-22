package com.paklog.equipment.domain.aggregate;
import com.paklog.equipment.domain.valueobject.MaintenanceType;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
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
}
