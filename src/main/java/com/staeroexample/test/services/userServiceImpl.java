package com.staeroexample.test.services;

import com.staeroexample.test.model.userModel;
import com.staeroexample.test.repo.userRepo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
public class userServiceImpl implements userService{

    @Resource
    private userRepo uRepo;

    @Override
    @Transactional
    public ArrayList<userModel> findAllUsers(){
        ArrayList<userModel> result = (ArrayList<userModel>) uRepo.findAll();
        return result;
    }

    @Override
    @Transactional
    public userModel findUser(int id) {
        return uRepo.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public userModel createUser(userModel user) {
        return uRepo.saveAndFlush(user);
    }

    @Override
    @Transactional
    public void deleteUser(userModel user) {
        uRepo.delete(user);
    }

    @Override
    @Transactional
    public userModel editUser(userModel user) {
        return uRepo.saveAndFlush(user);
    }


}
