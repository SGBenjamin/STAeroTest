package com.staeroexample.test.services;

import com.staeroexample.test.model.flightModel;
import com.staeroexample.test.model.userModel;

import java.util.ArrayList;
import java.util.List;

public interface flightService {
    flightModel saveFlight(flightModel flight);

    List<flightModel> fetchFlightList();

    flightModel updateFlight(flightModel flight, int id);

    void deleteFlightByID(int id);


}
