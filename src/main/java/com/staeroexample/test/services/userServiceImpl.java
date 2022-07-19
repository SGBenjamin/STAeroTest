package com.staeroexample.test.services;

import com.staeroexample.test.model.userModel;
import com.staeroexample.test.repo.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService{

    @Autowired
    private userRepo uRepo;

    @Override
    public userModel saveUser(userModel user){
        return uRepo.save(user);
    }

    @Override
    public List<userModel> fetchUserList(){
        return (List<userModel>) uRepo.findAll();
    }
//    @Override
//    public List<userModel> fetchUserList(){
//        return (List<userModel>) uRepo.findallExcPW();
//    }

    @Override
    public userModel updateUser(userModel user, int id) {
        return null;
    }

    @Override
    public void deleteUserByID(int id){
        uRepo.deleteById(id);
    }



}
