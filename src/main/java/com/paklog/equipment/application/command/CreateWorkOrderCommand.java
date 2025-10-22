package com.paklog.equipment.application.command;
import lombok.*;
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class CreateWorkOrderCommand {
    private String assetId;
    private String title;
    private String description;
    private String priority;
    private String assignedTo;
}
