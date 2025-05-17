package com.marine.monitoringsystem.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "biology_data", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"year", "month", "day", "season"})
})
public class BiologyData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String species;

    @Column(name = "station_id")
    private Integer stationId;

    private Integer year;
    private Integer month;
    private Integer day;

    private LocalDateTime time;
    private String season;

    private Float tph;
    private Float sulfide;
    
    @Column(name = "voc")
    private Float voc;

    private Float copper;
    private Float zinc;
    private Float lead;
    private Float cadmium;
    private Float mercury;
    private Float arsenic;
    private Float chromium;

    @Column(name = "insert_time")
    private LocalDateTime insertTime;

    @Column(name = "update_time")
    private LocalDateTime updateTime;

    // Getters and setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    public Integer getStationId() { return stationId; }
    public void setStationId(Integer stationId) { this.stationId = stationId; }

    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }

    public Integer getMonth() { return month; }
    public void setMonth(Integer month) { this.month = month; }

    public Integer getDay() { return day; }
    public void setDay(Integer day) { this.day = day; }

    public LocalDateTime getTime() { return time; }
    public void setTime(LocalDateTime time) { this.time = time; }

    public String getSeason() { return season; }
    public void setSeason(String season) { this.season = season; }

    public Float getTph() { return tph; }
    public void setTph(Float tph) { this.tph = tph; }

    public Float getSulfide() { return sulfide; }
    public void setSulfide(Float sulfide) { this.sulfide = sulfide; }

    public Float getVoc() { return voc; }
    public void setVoc(Float voc) { this.voc = voc; }

    public Float getCopper() { return copper; }
    public void setCopper(Float copper) { this.copper = copper; }

    public Float getZinc() { return zinc; }
    public void setZinc(Float zinc) { this.zinc = zinc; }

    public Float getLead() { return lead; }
    public void setLead(Float lead) { this.lead = lead; }

    public Float getCadmium() { return cadmium; }
    public void setCadmium(Float cadmium) { this.cadmium = cadmium; }

    public Float getMercury() { return mercury; }
    public void setMercury(Float mercury) { this.mercury = mercury; }

    public Float getArsenic() { return arsenic; }
    public void setArsenic(Float arsenic) { this.arsenic = arsenic; }

    public Float getChromium() { return chromium; }
    public void setChromium(Float chromium) { this.chromium = chromium; }

    public LocalDateTime getInsertTime() { return insertTime; }
    public void setInsertTime(LocalDateTime insertTime) { this.insertTime = insertTime; }

    public LocalDateTime getUpdateTime() { return updateTime; }
    public void setUpdateTime(LocalDateTime updateTime) { this.updateTime = updateTime; }
}