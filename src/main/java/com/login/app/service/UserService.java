package com.login.app.service;

import com.login.app.models.User;

public interface UserService {
void userSignup(User user);
User userLogin(String email,String pass);
User passwordForget(String email);
void updatePassword(User u);
}
