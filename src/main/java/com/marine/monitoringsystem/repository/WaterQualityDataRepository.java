package com.marine.monitoringsystem.repository;

import com.marine.monitoringsystem.model.WaterQualityData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WaterQualityDataRepository extends JpaRepository<WaterQualityData, Long> {
}