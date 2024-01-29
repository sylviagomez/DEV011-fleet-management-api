package com.fleetManagement.demo.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Taxi {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
    @Id
    private Integer id;
    private String plate;

}
