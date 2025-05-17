package com.marine.monitoringsystem.controller;

import com.marine.monitoringsystem.model.OceanBouyData;
import com.marine.monitoringsystem.repository.OceanBouyDataRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ocean-bouy")
public class OceanBouyDataController {

    private final OceanBouyDataRepository repository;

    public OceanBouyDataController(OceanBouyDataRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<OceanBouyData> getAll() {
        return repository.findAll();
    }
}