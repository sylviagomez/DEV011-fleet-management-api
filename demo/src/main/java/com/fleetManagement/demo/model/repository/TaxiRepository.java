package com.fleetManagement.demo.model.repository;

import com.fleetManagement.demo.model.entities.Taxi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxiRepository extends JpaRepository<Taxi, Integer> {
}
