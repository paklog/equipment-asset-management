package com.paklog.equipment.domain.aggregate;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
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
}
