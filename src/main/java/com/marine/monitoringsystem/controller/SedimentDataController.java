package com.marine.monitoringsystem.controller;

import com.marine.monitoringsystem.model.SedimentData;
import com.marine.monitoringsystem.repository.SedimentDataRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sediment")
public class SedimentDataController {

    private final SedimentDataRepository repository;

    public SedimentDataController(SedimentDataRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<SedimentData> getAll() {
        return repository.findAll();
    }
}