package com.staeroexample.test.controller;

import com.staeroexample.test.model.flightModel;
import com.staeroexample.test.services.flightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class flightController {

    @Autowired
    private flightService flightService;

    @GetMapping("/flightLog")
    public List<flightModel> fetchFlightList(){return flightService.fetchFlightList();}

    @PostMapping("/flightLog")
    public flightModel saveFlight(@Valid @RequestBody flightModel flight){return flightService.saveFlight(flight);}

    @DeleteMapping("/flightLog/{id}")
    public String deleteFlightByID(@PathVariable("id") int id){
        flightService.deleteFlightByID(id);
        return "Deleted Successfully";
    }

    @PutMapping("/flightLog/{id}")
    public String updateFlight(@Valid @PathVariable("id") int id, @RequestBody flightModel flight){
        flightService.updateFlight(flight, id);
        return "Update Successful";
    }

    @GetMapping("/flightLog/{flightID}")
    public List<flightModel> fetchFlightsByID(@PathVariable("flightID") String flightID){
        return flightService.findFlightsbyFlightID(flightID);
    }
}
