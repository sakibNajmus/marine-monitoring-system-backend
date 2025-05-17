package com.marine.monitoringsystem.repository;

import com.marine.monitoringsystem.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {
}
