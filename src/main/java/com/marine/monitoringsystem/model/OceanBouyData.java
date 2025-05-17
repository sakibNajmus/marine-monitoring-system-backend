package com.marine.monitoringsystem.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ocean_bouy_data")
public class OceanBouyData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "station_id")
    private Integer stationId;

    private Integer year;
    private Integer month;
    private LocalDateTime time;

    @Column(name = "cod")
    private Float cod;

    @Column(name = "petroleum_class")
    private Float petroleumClass;

    @Column(name = "ftu")
    private Float ftu;

    @Column(name = "ph")
    private Float ph;

    @Column(name = "dissolved_oxygen")
    private Float dissolvedOxygen;

    @Column(name = "chla")
    private Float chla;

    @Column(name = "nh4")
    private Float nh4;

    @Column(name = "no3")
    private Float no3;

    @Column(name = "po4")
    private Float po4;

    @Column(name = "no2")
    private Float no2;

    @Column(name = "psu")
    private Float psu;

    @Column(name = "bga")
    private Float bga;

    @Column(name = "insert_time")
    private LocalDateTime insertTime;

    @Column(name = "updated_time")
    private LocalDateTime updatedTime;

    // Getters and Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getStationId() { return stationId; }
    public void setStationId(Integer stationId) { this.stationId = stationId; }

    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }

    public Integer getMonth() { return month; }
    public void setMonth(Integer month) { this.month = month; }

    public LocalDateTime getTime() { return time; }
    public void setTime(LocalDateTime time) { this.time = time; }

    public Float getCod() { return cod; }
    public void setCod(Float cod) { this.cod = cod; }

    public Float getPetroleumClass() { return petroleumClass; }
    public void setPetroleumClass(Float petroleumClass) { this.petroleumClass = petroleumClass; }

    public Float getFtu() { return ftu; }
    public void setFtu(Float ftu) { this.ftu = ftu; }

    public Float getPh() { return ph; }
    public void setPh(Float ph) { this.ph = ph; }

    public Float getDissolvedOxygen() { return dissolvedOxygen; }
    public void setDissolvedOxygen(Float dissolvedOxygen) { this.dissolvedOxygen = dissolvedOxygen; }

    public Float getChla() { return chla; }
    public void setChla(Float chla) { this.chla = chla; }

    public Float getNh4() { return nh4; }
    public void setNh4(Float nh4) { this.nh4 = nh4; }

    public Float getNo3() { return no3; }
    public void setNo3(Float no3) { this.no3 = no3; }

    public Float getPo4() { return po4; }
    public void setPo4(Float po4) { this.po4 = po4; }

    public Float getNo2() { return no2; }
    public void setNo2(Float no2) { this.no2 = no2; }

    public Float getPsu() { return psu; }
    public void setPsu(Float psu) { this.psu = psu; }

    public Float getBga() { return bga; }
    public void setBga(Float bga) { this.bga = bga; }

    public LocalDateTime getInsertTime() { return insertTime; }
    public void setInsertTime(LocalDateTime insertTime) { this.insertTime = insertTime; }

    public LocalDateTime getUpdatedTime() { return updatedTime; }
    public void setUpdatedTime(LocalDateTime updatedTime) { this.updatedTime = updatedTime; }
}