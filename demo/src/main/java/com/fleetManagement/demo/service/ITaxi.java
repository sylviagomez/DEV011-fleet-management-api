package com.fleetManagement.demo.service;

import com.fleetManagement.demo.model.entities.Taxi;

import java.util.List;

public interface ITaxi {
    List<Taxi> findAll();
    Taxi findById (Integer id);
}
