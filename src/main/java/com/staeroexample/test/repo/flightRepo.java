package com.staeroexample.test.repo;

import com.staeroexample.test.model.flightModel;
import com.staeroexample.test.model.userModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface flightRepo extends CrudRepository<flightModel, Integer> {

    @Query(value = "SELECT a FROM flightModel a where flightID = ?1")
    List<flightModel> findFlightsbyFlightID(String flightID);

}
