package com.marine.monitoringsystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "float_plant_data")
public class FloatPlantData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phylum;
    private String genus;
    private String species;
    
    @Column(name = "scientific_name")
    private String scientificName;

    @Column(name = "iii_net")
    private String iiiNet;

    @Column(name = "water_sample")
    private String waterSample;

    private Integer year;
    private Integer month;
    private Integer day;
    private String time;
    private String season;

    // Getters and Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPhylum() { return phylum; }
    public void setPhylum(String phylum) { this.phylum = phylum; }

    public String getGenus() { return genus; }
    public void setGenus(String genus) { this.genus = genus; }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    public String getScientificName() { return scientificName; }
    public void setScientificName(String scientificName) { this.scientificName = scientificName; }

    public String getIiiNet() { return iiiNet; }
    public void setIiiNet(String iiiNet) { this.iiiNet = iiiNet; }

    public String getWaterSample() { return waterSample; }
    public void setWaterSample(String waterSample) { this.waterSample = waterSample; }

    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }

    public Integer getMonth() { return month; }
    public void setMonth(Integer month) { this.month = month; }

    public Integer getDay() { return day; }
    public void setDay(Integer day) { this.day = day; }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }

    public String getSeason() { return season; }
    public void setSeason(String season) { this.season = season; }
}
