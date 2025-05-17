package com.marine.monitoringsystem.repository;

import com.marine.monitoringsystem.model.BiologyData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BiologyDataRepository extends JpaRepository<BiologyData, Long> {
}
