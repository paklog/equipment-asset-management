package com.paklog.equipment.domain.repository;
import com.paklog.equipment.domain.aggregate.Asset;
import com.paklog.equipment.domain.valueobject.AssetStatus;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
public interface AssetRepository extends MongoRepository<Asset, String> {
    List<Asset> findByStatus(AssetStatus status);
}
