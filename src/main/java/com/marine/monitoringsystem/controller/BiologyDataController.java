package com.marine.monitoringsystem.controller;

import com.marine.monitoringsystem.model.BiologyData;
import com.marine.monitoringsystem.repository.BiologyDataRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/biology")
public class BiologyDataController {

    private final BiologyDataRepository repository;

    public BiologyDataController(BiologyDataRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<BiologyData> getAll() {
        return repository.findAll();
    }
}
