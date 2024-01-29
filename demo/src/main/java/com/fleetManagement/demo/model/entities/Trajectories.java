package com.fleetManagement.demo.model.entities;

import java.util.Date;

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

    private Integer id;
    private Integer id_taxi;
    private Date date;
    private double latitude;
    private double longitude;

}
