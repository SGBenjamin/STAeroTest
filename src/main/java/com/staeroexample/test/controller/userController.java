package com.staeroexample.test.controller;

import com.staeroexample.test.model.userModel;
import com.staeroexample.test.repo.userRepo;
import com.staeroexample.test.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class userController {

    @Autowired
    private userService userService;

    @Autowired
    private userRepo userRepo;

    @GetMapping("/user")
    public List<userModel> fetchUserList() {
        return userService.fetchUserList();
    }
    @GetMapping("/info")
    public userModel getUserDetails(){
        String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userRepo.findByUsername(username).get();
    }

    @PostMapping("/user/register")
    public userModel saveUser(@Valid @RequestBody userModel user){
        return userService.saveUser(user);
    }

    @DeleteMapping("/user/{id}")
    public String deleteUserByID(@PathVariable("id") int id){
        userService.deleteUserByID(id);
        return "Deleted Successfully";
    }



}
