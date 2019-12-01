package com.unicyb.repositories;

import com.unicyb.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByName(String username);
    User findById(int id);
    User findByRegistrationDate(String registrationDate);
    List<User> findAll();
    @Modifying()
    @Query("update User u set u.typeOfPreference = :preference where u.id = :id")
    void setUserPreference(@Param("preference") String preference,@Param("id") int id);
//    @Query("update Customer c set c.name = :name WHERE c.id = :customerId")
//    void setCustomerName(@Param("customerId") Long id);
}
