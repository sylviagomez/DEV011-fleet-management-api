package com.fleetManagement.demo.model.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "taxis")
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
    @Column(name = "plate")
    private String plate;

    @OneToMany(mappedBy = "taxi") // Relación OneToMany ya que un Taxi puede tener múltiples trayectorias
    private List<Trajectories> trajectoriesList;

}
