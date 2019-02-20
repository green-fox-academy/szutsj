package com.greenfoxacademy.pirateinspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PirateshipController {

  @GetMapping("/pirate/game with ships")
  public String choosePirate(){
    return "shipInfo";
  }

}
