package com.paklog.equipment.asset.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.kafka.annotation.EnableKafka;

/**
 * Equipment Asset Management
 *
 * Asset tracking and predictive maintenance
 *
 * @author Paklog Team
 * @version 1.0.0
 */
@SpringBootApplication
@EnableKafka
@EnableMongoAuditing
public class EquipmentAssetManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(EquipmentAssetManagementApplication.class, args);
    }
}