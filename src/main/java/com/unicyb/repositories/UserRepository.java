package com.unicyb.repositories;

import com.unicyb.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByName(String username);
    User findById(int id);
    User findByRegistrationDate(String registrationDate);
    List<User> findAll();
}
