package com.startclick.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.startclick.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
