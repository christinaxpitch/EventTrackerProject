package com.skilldistillery.cc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.cc.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
