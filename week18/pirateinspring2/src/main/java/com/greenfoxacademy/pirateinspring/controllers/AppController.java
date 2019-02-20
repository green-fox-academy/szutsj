package com.greenfoxacademy.pirateinspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

  @GetMapping("/pirate")
  public String startApp(){
    return "startPage";
  }

  @GetMapping("/pirate/about")
  public String about(){
    return "aboutTheGame";
  }

  @GetMapping("/pirate/start")
  public String startingGame(){
    return "startingGame";
  }

}
