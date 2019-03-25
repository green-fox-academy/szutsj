package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  UserRepository userRepository;

  @Autowired
  public UserService(){

  }

}
