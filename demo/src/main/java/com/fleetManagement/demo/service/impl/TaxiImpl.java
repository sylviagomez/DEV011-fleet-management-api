package com.fleetManagement.demo.service.impl;

import com.fleetManagement.demo.model.entities.Taxi;
import com.fleetManagement.demo.model.repository.TaxiRepository;
import com.fleetManagement.demo.service.ITaxi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TaxiImpl implements ITaxi {
    @Autowired
    private TaxiRepository taxiRepository;
    @Transactional(readOnly = true)
    @Override
    public List<Taxi> findAll() {
        return (List<Taxi>) taxiRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Taxi> findById(Integer id) {
        return taxiRepository.findById(id);
    }
}
