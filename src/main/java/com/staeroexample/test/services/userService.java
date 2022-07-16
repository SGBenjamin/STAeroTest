package com.staeroexample.test.services;

import com.staeroexample.test.model.userModel;

import java.util.ArrayList;

public interface userService {
    ArrayList<userModel> findAllUsers();

    userModel findUser (int id);

    userModel createUser(userModel user);

    void deleteUser(userModel user);

    userModel editUser(userModel user);



}
