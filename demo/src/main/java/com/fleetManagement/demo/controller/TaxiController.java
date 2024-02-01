package com.fleetManagement.demo.controller;

import com.fleetManagement.demo.model.entities.Taxi;
import com.fleetManagement.demo.service.ITaxi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class TaxiController {
    @Autowired
    private ITaxi taxiService;

    @GetMapping("taxi/(id)")
    public Optional<Taxi> showById(@PathVariable Integer id){
        return taxiService.findById(id);
    }

    @GetMapping("taxis")
    public List<Taxi> showAll(){
        return taxiService.findAll();
    }
}
