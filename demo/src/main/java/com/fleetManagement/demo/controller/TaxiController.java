/*package com.fleetManagement.demo.controller;

import com.fleetManagement.demo.model.entities.Taxi;
import com.fleetManagement.demo.service.TaxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/taxis")
public class TaxiController {
    @Autowired
    private TaxiService taxiService;

    @GetMapping
    public ResponseEntity<List<Taxi>> getTaxis(@RequestParam(required = false)String query){
        List<Taxi> taxis = taxiService.getTaxis(query);
        return new ResponseEntity<>(taxis, HttpStatusCode.valueOf(200));
    }
}*/
