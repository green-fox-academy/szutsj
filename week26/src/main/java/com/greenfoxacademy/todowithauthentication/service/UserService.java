package com.greenfoxacademy.todowithauthentication.service;

import com.greenfoxacademy.todowithauthentication.model.User;
import com.greenfoxacademy.todowithauthentication.repository.TodoRepository;
import com.greenfoxacademy.todowithauthentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private UserRepository userRepository;
  private TodoRepository todoRepository;

  @Autowired
  public UserService(UserRepository userRepository, TodoRepository todoRepository) {
    this.userRepository = userRepository;
    this.todoRepository = todoRepository;
  }

  public void save(User user){
    userRepository.save(user);
  }


}
