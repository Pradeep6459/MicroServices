package com.userservices.controller;

import com.userservices.services.Userservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class Usercontroller
{
    @Autowired
    public Userservices userservices;
    @PostMapping("/")
    public User saveUser(User user){
        return userservices.savrUser(user);


}



}
