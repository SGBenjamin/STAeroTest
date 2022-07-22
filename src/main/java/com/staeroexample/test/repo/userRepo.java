package com.staeroexample.test.repo;

import com.staeroexample.test.model.userModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public interface userRepo extends JpaRepository<userModel, Integer> {

//    @Query(value = "Select u.id, u.username, u.accesstoken FROM Users u", nativeQuery = true)
//    List<userModel> findByUserAccesstoken();

    interface userProjection{
        String getUsername();
        String getAccessToken();
    }

    @Query(value = "select username, accessToken from users", nativeQuery = true)
    List<userProjection> findUsername();


}
