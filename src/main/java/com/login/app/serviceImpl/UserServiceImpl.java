package com.login.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.app.models.User;
import com.login.app.repository.UserRepo;
import com.login.app.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;

	@Override
	public void userSignup(User user) {
		userRepo.save(user);
		
	}

	@Override
	public User userLogin(String email, String pass) {
		
		return userRepo.findByEmailAndPassword(email, pass);
	}

	@Override
	public User passwordForget(String email) {
		
		return userRepo.findByEmail(email);
	}

	@Override
	public void updatePassword(User u) {
		userRepo.save(u);
		
	}

}
