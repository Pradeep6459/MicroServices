package com.userservices.services;

import com.userservices.repository.Userrepository;

public class Userservices {
    public Userrepository userrepository;

    public User savrUser(User user) {
        return userrepository.save(user);
    }
}
