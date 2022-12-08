package com.javaguids.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaguids.springboot.entity.User;

@Repository

public interface UserRepository extends JpaRepository<User,Long> {

}
