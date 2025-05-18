package com.marine.monitoringsystem.controller;

import com.marine.monitoringsystem.model.WaterQualityData;
import com.marine.monitoringsystem.repository.WaterQualityDataRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api/water-quality")
public class WaterQualityDataController {

    private final WaterQualityDataRepository repository;

    public WaterQualityDataController(WaterQualityDataRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<WaterQualityData> getAll() {
        return repository.findAll();
    }
    
    @GetMapping("/station/{stationId}")
    public ResponseEntity<WaterQualityData> getLatestByStation(@PathVariable int stationId) {
        return repository.findTopByStationIdOrderByTimeDesc(stationId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}