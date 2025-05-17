package com.marine.monitoringsystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "avg_station")
public class AvgStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "station_id")
    private String stationId;

    private int year;
    private int month;
    private String time;
    private Double cod;
    private Double nh4;
    private Double n;
    private Double p;
    private Double ph;

    // ✅ Add Getters and Setters (ESSENTIAL for JSON to work)

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStationId() { return stationId; }
    public void setStationId(String stationId) { this.stationId = stationId; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getMonth() { return month; }
    public void setMonth(int month) { this.month = month; }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }

    public Double getCod() { return cod; }
    public void setCod(Double cod) { this.cod = cod; }

    public Double getNh4() { return nh4; }
    public void setNh4(Double nh4) { this.nh4 = nh4; }

    public Double getN() { return n; }
    public void setN(Double n) { this.n = n; }

    public Double getP() { return p; }
    public void setP(Double p) { this.p = p; }

    public Double getPh() { return ph; }
    public void setPh(Double ph) { this.ph = ph; }
}
