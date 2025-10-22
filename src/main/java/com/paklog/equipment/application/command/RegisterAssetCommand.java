package com.paklog.equipment.application.command;
import com.paklog.equipment.domain.valueobject.AssetType;
import lombok.*;
import java.time.LocalDate;
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class RegisterAssetCommand {
    private String serialNumber;
    private String name;
    private AssetType type;
    private String manufacturer;
    private String model;
    private LocalDate purchaseDate;
    private double purchaseCost;
    private String location;
}
