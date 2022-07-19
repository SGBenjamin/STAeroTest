package com.staeroexample.test.services;

import com.staeroexample.test.model.flightModel;
import com.staeroexample.test.repo.flightRepo;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

public class flightServiceImpl implements flightService{

    @Resource
    private flightRepo fRepo;

    @Override
    public flightModel saveFlight(flightModel flight){
        return fRepo.save(flight);
    }

    @Override
    public List<flightModel> fetchFlightList(){
        return(List<flightModel>) fRepo.findAll();
    }

    @Override
    public flightModel updateFlight(flightModel flight, int id){
        return null;
    }

    @Override
    public void deleteFlightByID(int id){
        fRepo.deleteById(id);
    }

}
