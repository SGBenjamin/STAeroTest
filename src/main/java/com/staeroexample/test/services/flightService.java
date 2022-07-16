package com.staeroexample.test.services;

import com.staeroexample.test.model.flightModel;

import java.util.ArrayList;

public interface flightService {

    ArrayList<flightModel> findAllFlights();

    flightModel findFlight(int id);

    flightModel createFlight(flightModel flight);

    flightModel editFlight(flightModel flight);

    void deleteFlight(flightModel flight);

}
