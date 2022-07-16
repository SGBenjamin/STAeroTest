package com.staeroexample.test.services;

import com.staeroexample.test.model.flightModel;
import com.staeroexample.test.repo.flightRepo;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.ArrayList;

public class flightServiceImpl implements flightService{

    @Resource
    private flightRepo fRepo;


    @Override
    @Transactional
    public ArrayList<flightModel> findAllFlights() {
        ArrayList<flightModel> result = (ArrayList<flightModel>) fRepo.findAll();
        return result;
    }

    @Override
    @Transactional
    public flightModel findFlight(int id) {
        return fRepo.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public flightModel createFlight(flightModel flight) {
        return fRepo.saveAndFlush(flight);
    }

    @Override
    @Transactional
    public flightModel editFlight(flightModel flight) {
        return fRepo.saveAndFlush(flight);
    }

    @Override
    @Transactional
    public void deleteFlight(flightModel flight) {
        fRepo.delete(flight);
    }
}
