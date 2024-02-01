package com.fleetManagement.demo.service;

import com.fleetManagement.demo.model.entities.Trajectories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ITrajectories {
    List<Trajectories> findAll();
    Optional<Trajectories> findById (Integer taxi_id);
}
