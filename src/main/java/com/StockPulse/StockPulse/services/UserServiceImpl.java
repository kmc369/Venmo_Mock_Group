package com.StockPulse.StockPulse.services;

import com.StockPulse.StockPulse.models.User;
import com.StockPulse.StockPulse.repos.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(String username, String password, String email) {
        User newUser  = new User(username, password,email);
        return userRepository.save(newUser);
    }

    @Override
    public User loginUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username,password);
    }

    @Override
    public void logoutUser(User user) {
        //do i need logout operations ?
    }
}
