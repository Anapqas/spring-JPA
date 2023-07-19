package com.anaanderi.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anaanderi.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{


}
