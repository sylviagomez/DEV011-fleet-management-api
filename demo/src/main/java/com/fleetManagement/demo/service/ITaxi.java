package com.fleetManagement.demo.service;

import com.fleetManagement.demo.model.entities.Taxi;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ITaxi {
    List<Taxi> findAll();
    Optional<Taxi> findById (Integer id);
}
