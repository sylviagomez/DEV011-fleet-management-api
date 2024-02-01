package com.fleetManagement.demo.service.impl;

import com.fleetManagement.demo.model.entities.Trajectories;
import com.fleetManagement.demo.model.repository.TrajectoriesRepository;
import com.fleetManagement.demo.service.ITrajectories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TrajectoriesImpl implements ITrajectories {
    @Autowired
    private TrajectoriesRepository trajectoriesRepository;
    @Transactional(readOnly = true)
    @Override
    public List<Trajectories> findAll() {
        return (List<Trajectories>) trajectoriesRepository.findAll() ;
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Trajectories> findById(Integer taxi_id) {
        return trajectoriesRepository.findById(taxi_id);
    }
}
