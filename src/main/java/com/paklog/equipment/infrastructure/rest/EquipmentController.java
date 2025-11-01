package com.paklog.equipment.infrastructure.rest;
import com.paklog.equipment.application.command.*;
import com.paklog.equipment.application.service.EquipmentApplicationService;
import com.paklog.equipment.domain.aggregate.*;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/equipment")
public class EquipmentController {
    private final EquipmentApplicationService service;
    public EquipmentController(EquipmentApplicationService service) {
        this.service = service;
    }


    @PostMapping("/assets")
    @Operation(summary = "Register asset")
    public ResponseEntity<Asset> registerAsset(@RequestBody RegisterAssetCommand command) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.registerAsset(command));
    }

    @PostMapping("/work-orders")
    @Operation(summary = "Create work order")
    public ResponseEntity<WorkOrder> createWorkOrder(@RequestBody CreateWorkOrderCommand command) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createWorkOrder(command));
    }

    @GetMapping("/assets/active")
    @Operation(summary = "Get active assets")
    public ResponseEntity<List<Asset>> getActiveAssets() {
        return ResponseEntity.ok(service.activeAssets());
    }

    @GetMapping("/maintenance/pending")
    @Operation(summary = "Get pending maintenance")
    public ResponseEntity<List<MaintenanceSchedule>> getPendingMaintenance() {
        return ResponseEntity.ok(service.pendingMaintenance());
    }

    @GetMapping("/assets/{assetId}/predict-failure")
    @Operation(summary = "Predict asset failure")
    public ResponseEntity<FailurePrediction> predictFailure(@PathVariable String assetId) {
        return ResponseEntity.ok(service.predictFailure(assetId));
    }
}
