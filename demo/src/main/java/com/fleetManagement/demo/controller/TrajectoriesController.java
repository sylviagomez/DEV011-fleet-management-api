package com.fleetManagement.demo.controller;

import com.fleetManagement.demo.model.entities.Taxi;
import com.fleetManagement.demo.model.entities.Trajectories;
import com.fleetManagement.demo.service.ITrajectories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class TrajectoriesController {
    @Autowired
    private ITrajectories trajectoriesService;
    @GetMapping("trajectory/(id)")
    public Optional<Trajectories> showById(@PathVariable Integer id){
        return trajectoriesService.findById(id);
    }

    @GetMapping("trajectories")
    public List<Trajectories> showAll(){
        return trajectoriesService.findAll();
    }
}
