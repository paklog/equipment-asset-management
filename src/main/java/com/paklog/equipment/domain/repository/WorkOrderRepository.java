package com.paklog.equipment.domain.repository;
import com.paklog.equipment.domain.aggregate.WorkOrder;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
public interface WorkOrderRepository extends MongoRepository<WorkOrder, String> {
    List<WorkOrder> findByAssetId(String assetId);
    List<WorkOrder> findByStatus(String status);
}
