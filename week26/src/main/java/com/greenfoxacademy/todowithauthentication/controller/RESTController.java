package com.greenfoxacademy.todowithauthentication.controller;

import com.greenfoxacademy.todowithauthentication.model.Todo;
import com.greenfoxacademy.todowithauthentication.model.User;
import com.greenfoxacademy.todowithauthentication.service.TodoService;
import com.greenfoxacademy.todowithauthentication.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {

  private UserService userService;
  private TodoService todoService;

  public RESTController(UserService userService, TodoService todoService) {
    this.userService = userService;
    this.todoService = todoService;
  }

  @PostMapping("/register")
  public ResponseEntity<Object> register(@RequestBody User user, CsrfToken token){
    return ResponseEntity.status(HttpStatus.OK).body("Még ezen dolgozunk:)");
  }

  @PostMapping("/login")
  public ResponseEntity<Object> login(@RequestBody User user){
    return ResponseEntity.status(HttpStatus.OK).body("Még ezen dolgozunk:)");
  }

  @PostMapping("/add")
  public ResponseEntity<Object> addTodo(@RequestBody Todo todo){
    return ResponseEntity.status(HttpStatus.OK).body("Még ezen dolgozunk:)");
  }

  @GetMapping("/list")
  public ResponseEntity<Object> listTodo(){
    return ResponseEntity.status(HttpStatus.OK).body("Még ezen dolgozunk:)");
  }

}
