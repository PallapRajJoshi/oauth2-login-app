package com.login.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.app.models.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	User findByEmailAndPassword(String email,String password);
	User findByEmail(String email);

}
