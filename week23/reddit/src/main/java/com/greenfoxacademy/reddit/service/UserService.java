package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.User;
import com.greenfoxacademy.reddit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetTime;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

  @Autowired
  UserRepository userRepository;

  public Optional<User> findUserById(Long id){
    return userRepository.findById(id);
  }
  public boolean exist(String name){
    return userRepository.findByName(name).isPresent();
  }

  public boolean checkPassword(String name, String password){
    User userInDb = userRepository.findByName(name).get();
    return userInDb.getPassword().equals(password);
  }

  public void save(User user){
    userRepository.save(user);
  }

  public User register(String name, String password){
    userRepository.save(new User(name, password));
    return userRepository.findByName(name).get();
  }

  public Optional<User> findByName(String name){
    return userRepository.findByName(name);
  }


}


