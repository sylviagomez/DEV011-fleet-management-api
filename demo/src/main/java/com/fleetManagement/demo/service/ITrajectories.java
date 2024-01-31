package com.fleetManagement.demo.service;

import com.fleetManagement.demo.model.entities.Taxi;
import com.fleetManagement.demo.model.entities.Trajectories;

import java.util.List;

public interface ITrajectories {
    List<Trajectories> findAll();
    List<Trajectories> findById (Integer taxi_id);
}
