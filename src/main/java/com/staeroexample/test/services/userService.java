package com.staeroexample.test.services;

import com.staeroexample.test.model.userModel;
import com.staeroexample.test.repo.userRepo;

import java.util.List;

public interface userService {
    userModel saveUser(userModel user);

    //    @Override
    //    public List<userModel> fetchUserList(){
    //        return uRepo.findAll();
    //    }
    List<userRepo.userProjection> fetchUserList();

    userModel updateUser(userModel user, int id);

    void deleteUserByID(int id);

}
