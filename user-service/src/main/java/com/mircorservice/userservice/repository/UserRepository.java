package com.mircorservice.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mircorservice.userservice.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
