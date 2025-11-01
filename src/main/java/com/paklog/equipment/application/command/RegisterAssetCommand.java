package com.paklog.equipment.application.command;

import com.paklog.equipment.domain.valueobject.AssetType;
import java.time.LocalDate;

public record RegisterAssetCommand(
    String serialNumber,
    String name,
    AssetType type,
    String manufacturer,
    String model,
    LocalDate purchaseDate,
    double purchaseCost,
    String location
) {}
