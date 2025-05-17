package com.marine.monitoringsystem.controller;

import com.marine.monitoringsystem.model.AvgStation;
import com.marine.monitoringsystem.repository.AvgStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/avg-station")
public class AvgStationController {

    @Autowired
    private AvgStationRepository repository;

    @GetMapping
    public List<AvgStation> getAll() {
        return repository.findAll();
    }
}
