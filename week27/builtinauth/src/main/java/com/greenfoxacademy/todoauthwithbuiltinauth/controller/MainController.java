package com.greenfoxacademy.todoauthwithbuiltinauth.controller;

import com.greenfoxacademy.todoauthwithbuiltinauth.model.User;
import com.greenfoxacademy.todoauthwithbuiltinauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  private UserService userService;

  @Autowired
  public MainController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/login")
  public String login(){
    return "login";
  }

  @PostMapping("/perform_login")
  @ResponseBody
  public String afterLogin(@RequestBody User user){
    String input = user.getUsername() + " " + user.getPassword();
    return input + " : Login was accepted";
  }

  @GetMapping("/register")
  @ResponseBody
  public String register(){
    return "Bejutottam a register oldalon";
  }

  @PostMapping("/register")
  @ResponseBody
  public String PostedToRegister(){
    System.out.println("Posted by login to register url");
    return "Bejutottam a register oldalon";
  }

  @GetMapping("/protected")
  @ResponseBody
  public String justAuthorizedCanComeIn(){
    return "Opps, bejutottam a protected oldalon";
  }

  @PostMapping("/protected")
  @ResponseBody
  public String forwardAfterSuccessfulLogin(){
    System.out.println("posted by loginform to protected url");
    return "Yee, bejutottam a protected oldalra!!!";
  }
}
