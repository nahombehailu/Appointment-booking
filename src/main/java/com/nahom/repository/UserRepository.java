package com.nahom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nahom.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
