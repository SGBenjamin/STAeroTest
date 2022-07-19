package com.staeroexample.test.services;

import com.staeroexample.test.model.flightModel;
import com.staeroexample.test.repo.flightRepo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
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
    public flightModel updateFlight(flightModel newFlight, int id){
        return fRepo.findById(id)
                        .map(flight -> {
                            flight.setTailNumber(newFlight.getTailNumber());
                            flight.setTakeoff(newFlight.getTakeoff());
                            flight.setLanding(newFlight.getLanding());
                            flight.setDuration(newFlight.getDuration());
                            return fRepo.save(flight);
                        })
                .orElseGet(() ->{
                    return fRepo.save(newFlight);
                });
    }

    @Override
    public void deleteFlightByID(int id){
        fRepo.deleteById(id);
    }

}
