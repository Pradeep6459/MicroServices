package com.userservices.repository;

import com.userservices.UserServicesApplication;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Userrepository extends JpaRepository<User,Long> {
}
