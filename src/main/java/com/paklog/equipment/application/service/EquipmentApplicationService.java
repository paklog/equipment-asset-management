package com.paklog.equipment.application.service;
import com.paklog.equipment.application.command.*;
import com.paklog.equipment.domain.aggregate.*;
import com.paklog.equipment.domain.repository.*;
import com.paklog.equipment.domain.service.PredictiveMaintenanceService;
import com.paklog.equipment.domain.valueobject.AssetStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.Instant;
import java.util.*;

@Service @RequiredArgsConstructor
public class EquipmentApplicationService {
    private final AssetRepository assetRepository;
    private final WorkOrderRepository workOrderRepository;
    private final MaintenanceScheduleRepository scheduleRepository;
    private final PredictiveMaintenanceService predictiveService;

    @Transactional
    public Asset registerAsset(RegisterAssetCommand command) {
        Asset asset = Asset.builder()
                .assetId(UUID.randomUUID().toString())
                .serialNumber(command.getSerialNumber())
                .name(command.getName())
                .type(command.getType())
                .status(AssetStatus.ACTIVE)
                .manufacturer(command.getManufacturer())
                .model(command.getModel())
                .purchaseDate(command.getPurchaseDate())
                .purchaseCost(command.getPurchaseCost())
                .currentValue(command.getPurchaseCost())
                .location(command.getLocation())
                .totalOperatingHours(0)
                .utilizationPercentage(0.0)
                .build();
        return assetRepository.save(asset);
    }

    @Transactional
    public WorkOrder createWorkOrder(CreateWorkOrderCommand command) {
        WorkOrder workOrder = WorkOrder.builder()
                .workOrderId(UUID.randomUUID().toString())
                .assetId(command.getAssetId())
                .title(command.getTitle())
                .description(command.getDescription())
                .priority(command.getPriority())
                .assignedTo(command.getAssignedTo())
                .status("OPEN")
                .createdAt(Instant.now())
                .laborCost(0.0)
                .partsCost(0.0)
                .build();
        return workOrderRepository.save(workOrder);
    }

    @Transactional(readOnly = true)
    public List<Asset> getActiveAssets() {
        return assetRepository.findByStatus(AssetStatus.ACTIVE);
    }

    @Transactional(readOnly = true)
    public List<MaintenanceSchedule> getPendingMaintenance() {
        return scheduleRepository.findByCompleted(false);
    }

    @Transactional
    public FailurePrediction predictFailure(String assetId) {
        Asset asset = assetRepository.findById(assetId)
                .orElseThrow(() -> new IllegalArgumentException("Asset not found"));
        return predictiveService.predictFailure(asset);
    }
}
