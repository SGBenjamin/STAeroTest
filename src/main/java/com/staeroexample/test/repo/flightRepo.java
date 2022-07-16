package com.staeroexample.test.repo;

import com.staeroexample.test.model.flightModel;
import com.staeroexample.test.model.userModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface flightRepo extends JpaRepository<flightModel, Integer> {

    @Query("SELECT id FROM flightModel")
    userModel findAllFlightID();

}
