package com.marine.monitoringsystem.controller;

import com.marine.monitoringsystem.model.WaterQualityData;
import com.marine.monitoringsystem.repository.WaterQualityDataRepository;
import org.springframework.web.bind.annotation.*;

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
}