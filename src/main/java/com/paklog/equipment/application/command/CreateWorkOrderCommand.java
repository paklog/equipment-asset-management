package com.paklog.equipment.application.command;

public record CreateWorkOrderCommand(
    String assetId,
    String title,
    String description,
    String priority,
    String assignedTo
) {}
