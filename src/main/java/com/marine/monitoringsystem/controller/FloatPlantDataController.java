package com.marine.monitoringsystem.controller;

import com.marine.monitoringsystem.model.FloatPlantData;
import com.marine.monitoringsystem.repository.FloatPlantDataRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/float-plants")
public class FloatPlantDataController {

    private final FloatPlantDataRepository repository;

    public FloatPlantDataController(FloatPlantDataRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<FloatPlantData> getAll() {
        return repository.findAll();
    }
}
