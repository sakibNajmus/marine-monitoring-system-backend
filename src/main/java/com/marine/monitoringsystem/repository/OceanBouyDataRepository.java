package com.marine.monitoringsystem.repository;

import com.marine.monitoringsystem.model.OceanBouyData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OceanBouyDataRepository extends JpaRepository<OceanBouyData, Long> {
}