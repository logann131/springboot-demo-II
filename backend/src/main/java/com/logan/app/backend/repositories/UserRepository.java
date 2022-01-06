package com.logan.app.backend.repositories;

import com.logan.app.backend.models.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
                                                  // <User Schema, and the type of primary key>
public interface UserRepository extends JpaRepository<UserModel, Integer> {
    
}
