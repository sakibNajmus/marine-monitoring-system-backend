package com.marine.monitoringsystem.repository;

import com.marine.monitoringsystem.model.SedimentData;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SedimentDataRepository extends JpaRepository<SedimentData, Long> {
    Optional<SedimentData> findTopByStationIdOrderByTimeDesc(int stationId);
}