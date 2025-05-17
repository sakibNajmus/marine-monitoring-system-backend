package com.marine.monitoringsystem.repository;

import com.marine.monitoringsystem.model.SedimentData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SedimentDataRepository extends JpaRepository<SedimentData, Long> {
}