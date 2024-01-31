package com.fleetManagement.demo.model.entities;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Trajectories {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_taxi() {
        return id_taxi;
    }

    public void setId_taxi(Integer id_taxi) {
        this.id_taxi = id_taxi;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "id_taxi")
    private Integer id_taxi;
    @Column(name = "date")
    private Date date;
    @Column(name = "latitude")
    private double latitude;
    @Column(name = "longitude")
    private double longitude;

    @ManyToOne
    @JoinColumn(name = "taxi_id")
    private Taxi taxi;


}
