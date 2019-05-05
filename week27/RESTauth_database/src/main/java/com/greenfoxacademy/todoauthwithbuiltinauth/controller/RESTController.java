package com.greenfoxacademy.todoauthwithbuiltinauth.controller;

import com.greenfoxacademy.todoauthwithbuiltinauth.model.User;
import com.greenfoxacademy.todoauthwithbuiltinauth.service.MyUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {

  private MyUserDetailService myUserDetailService;

  @Autowired
  public RESTController(MyUserDetailService myUserDetailService) {
    this.myUserDetailService = myUserDetailService;
  }

  @PostMapping("/register")
  public ResponseEntity<User> register(@RequestBody User user){
   return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(user);
  }

  @PostMapping("/login")
  public ResponseEntity<User> login(@RequestBody User user){
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(user);
  }

  @RequestMapping("/protected")
  public ResponseEntity<User> featureForLoggedInUsers(@RequestBody User user){
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(user);

  }
}

