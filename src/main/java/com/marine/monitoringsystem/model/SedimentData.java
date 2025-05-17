package com.marine.monitoringsystem.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sediment_data", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"station_id", "year", "month", "day", "season"})
})
public class SedimentData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "station_id")
    private Integer stationId;

    private Integer year;
    private Integer month;
    private Integer day;
    private String season;
    private LocalDateTime time;

    private Float copper;
    private Float zinc;
    private Float lead;
    private Float cadmium;
    private Float mercury;
    private Float arsenic;
    private Float chromium;

    @Column(name = "oc")
    private Float oc;

    @Column(name = "petroleum_class")
    private Float petroleumClass;

    private Float sulfide;
    private Float gravel;
    private Float sand;
    private Float pinksand;
    private Float clay;

    private String codename;

    @Column(name = "insert_time")
    private LocalDateTime insertTime;

    @Column(name = "update_time")
    private LocalDateTime updateTime;

    // Getters and Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getStationId() { return stationId; }
    public void setStationId(Integer stationId) { this.stationId = stationId; }

    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }

    public Integer getMonth() { return month; }
    public void setMonth(Integer month) { this.month = month; }

    public Integer getDay() { return day; }
    public void setDay(Integer day) { this.day = day; }

    public String getSeason() { return season; }
    public void setSeason(String season) { this.season = season; }

    public LocalDateTime getTime() { return time; }
    public void setTime(LocalDateTime time) { this.time = time; }

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

    public Float getOc() { return oc; }
    public void setOc(Float oc) { this.oc = oc; }

    public Float getPetroleumClass() { return petroleumClass; }
    public void setPetroleumClass(Float petroleumClass) { this.petroleumClass = petroleumClass; }

    public Float getSulfide() { return sulfide; }
    public void setSulfide(Float sulfide) { this.sulfide = sulfide; }

    public Float getGravel() { return gravel; }
    public void setGravel(Float gravel) { this.gravel = gravel; }

    public Float getSand() { return sand; }
    public void setSand(Float sand) { this.sand = sand; }

    public Float getPinksand() { return pinksand; }
    public void setPinksand(Float pinksand) { this.pinksand = pinksand; }

    public Float getClay() { return clay; }
    public void setClay(Float clay) { this.clay = clay; }

    public String getCodename() { return codename; }
    public void setCodename(String codename) { this.codename = codename; }

    public LocalDateTime getInsertTime() { return insertTime; }
    public void setInsertTime(LocalDateTime insertTime) { this.insertTime = insertTime; }

    public LocalDateTime getUpdateTime() { return updateTime; }
    public void setUpdateTime(LocalDateTime updateTime) { this.updateTime = updateTime; }
}