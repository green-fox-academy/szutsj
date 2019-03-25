package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.service.PostService;
import com.greenfoxacademy.reddit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

  @Autowired
  UserService userService;

  @Autowired
  PostService postService;

}
