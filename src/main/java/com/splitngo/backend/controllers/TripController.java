package com.splitngo.backend.controllers;

import com.splitngo.backend.dtos.TripDTO;
import com.splitngo.backend.services.TripService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bff/trips")
public class TripController {

    private final TripService tripService;

    public TripController (TripService tripService){
        this.tripService = tripService;
    }

    @GetMapping
    public List<TripDTO> getAllTrips(){
        return tripService.getAllTrips();
    }
}
