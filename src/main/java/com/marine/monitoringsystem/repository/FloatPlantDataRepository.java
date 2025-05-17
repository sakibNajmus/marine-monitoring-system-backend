package com.marine.monitoringsystem.repository;

import com.marine.monitoringsystem.model.FloatPlantData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FloatPlantDataRepository extends JpaRepository<FloatPlantData, Long> {
}
