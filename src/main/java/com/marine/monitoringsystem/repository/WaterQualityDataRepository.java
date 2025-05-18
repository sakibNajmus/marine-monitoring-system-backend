package com.marine.monitoringsystem.repository;

import com.marine.monitoringsystem.model.WaterQualityData;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface WaterQualityDataRepository extends JpaRepository<WaterQualityData, Long> {
    Optional<WaterQualityData> findTopByStationIdOrderByTimeDesc(int stationId);
}