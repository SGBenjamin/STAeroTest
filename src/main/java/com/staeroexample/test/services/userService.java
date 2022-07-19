package com.staeroexample.test.services;

import com.staeroexample.test.model.userModel;

import java.util.ArrayList;
import java.util.List;

public interface userService {
    userModel saveUser(userModel user);

    List<userModel> fetchUserList();

    userModel updateUser(userModel user, int id);

    void deleteUserByID(int id);

}
