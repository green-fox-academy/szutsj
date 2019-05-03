package com.greenfoxacademy.todowithauthentication.service;

import com.greenfoxacademy.todowithauthentication.repository.TodoRepository;
import com.greenfoxacademy.todowithauthentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

  private UserRepository userRepository;
  private TodoRepository todoRepository;

  @Autowired
  public TodoService(UserRepository userRepository, TodoRepository todoRepository) {
    this.userRepository = userRepository;
    this.todoRepository = todoRepository;
  }

}
