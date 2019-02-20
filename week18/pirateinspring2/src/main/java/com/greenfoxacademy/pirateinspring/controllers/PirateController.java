package com.greenfoxacademy.pirateinspring.controllers;

import com.greenfoxacademy.pirateinspring.entities.Pirate;
import com.greenfoxacademy.pirateinspring.services.PirateManagementService;
import com.greenfoxacademy.pirateinspring.services.PirateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PirateController{

  @Autowired
  PirateManagementService pirateManagementService;

  @Autowired
  PirateService pirateService;

  @GetMapping("/pirate/game with pirate")
  public String choosePirate(Model model){
    model.addAttribute("captainlist", pirateManagementService);
    return "pirateInfo";
  }

  @PostMapping("/pirate/game with pirate")
  public String choosePirate(Model model, @ModelAttribute Pirate pirate){
    pirateManagementService.select(pirate);
    model.addAttribute("captain", pirate);
    return "pirateInfo2";
  }

  @GetMapping("/pirate/game with pirate/bar")
  public String goToBar(Model model){
    model.addAttribute("captain", pirateManagementService.getMyCaptain());
    return "bar2";
  }

  @PostMapping("/pirate/game with pirate/bar")
  public String askforBeer(Model model){
    Pirate pirate = pirateManagementService.getMyCaptain();
    pirateService.drinkSumRum(pirate);
    String status = pirateService.howsItGoingMate(pirate);
    model.addAttribute("captain", pirate);
    model.addAttribute("status", status);
    return "bar2";
  }

}
