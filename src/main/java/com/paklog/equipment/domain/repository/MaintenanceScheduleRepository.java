package com.paklog.equipment.domain.repository;
import com.paklog.equipment.domain.aggregate.MaintenanceSchedule;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
public interface MaintenanceScheduleRepository extends MongoRepository<MaintenanceSchedule, String> {
    List<MaintenanceSchedule> findByAssetId(String assetId);
    List<MaintenanceSchedule> findByCompleted(boolean completed);
}
