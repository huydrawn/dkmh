package com.example.dkmh.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dkmh.model.user.User;

@Repository
public interface ManageUser extends JpaRepository<User, Integer> {

}
