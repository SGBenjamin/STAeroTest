package com.staeroexample.test.repo;

import com.staeroexample.test.model.userModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface userRepo extends JpaRepository<userModel, Integer> {

    @Query("SELECT id FROM userModel")
    userModel findAllUserID();

}
