package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"","/"})
public class PostController {
  
  PostService postService;
  
  @Autowired
  public PostController(){
    
  }

}
