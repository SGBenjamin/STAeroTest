package com.staeroexample.test.repo;

import com.staeroexample.test.model.userModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface userRepo extends CrudRepository<userModel, Integer> {

    @Query("Select username, accessToken from userModel")
    List<userModel> findallExcPW();


}
