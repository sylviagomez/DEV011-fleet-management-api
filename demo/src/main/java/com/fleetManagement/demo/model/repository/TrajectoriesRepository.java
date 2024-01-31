package com.fleetManagement.demo.model.repository;

import com.fleetManagement.demo.model.entities.Trajectories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrajectoriesRepository extends JpaRepository<Trajectories, Integer> {
}
