package com.greenfoxacademy.pirateinspring.controllers;

import com.greenfoxacademy.pirateinspring.entities.Pirate;
import com.greenfoxacademy.pirateinspring.entities.PirateShip;
import com.greenfoxacademy.pirateinspring.services.GameService;
import com.greenfoxacademy.pirateinspring.services.PirateManagementService;
import com.greenfoxacademy.pirateinspring.services.PirateService;
import com.greenfoxacademy.pirateinspring.repositories.PirateshipHashMapRepository;
import com.greenfoxacademy.pirateinspring.services.PirateshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PirateController {

  @Autowired
  PirateManagementService pirateManagementService;

  @Autowired
  PirateService pirateService;

  @Autowired
  PirateshipHashMapRepository pirateshipHashMapRepository;

  @Autowired
  PirateshipService pirateshipService;

  @Autowired
  GameService gameService;

  @GetMapping("/pirate/restart")
  public String resetAndChoosePirate(Model model) {
    pirateManagementService.reset();
    pirateshipService.reset();
    model.addAttribute("captainlist", pirateManagementService);
    return "pirateInfo";
  }

  @GetMapping("/pirate")
  public String choosePirate(Model model) {
    model.addAttribute("captainlist", pirateManagementService);
    return "pirateInfo";
  }
  @PostMapping("/pirate/selectCaptain")
  public String choosePirate(Model model, @RequestParam String name) {
    pirateManagementService.select(name);
    Pirate captain = pirateManagementService.getMyCaptain();
    model.addAttribute("captain", captain);
    return "pirateInfo2";
  }

  @GetMapping("/pirate/waterToCaptain")
  public String waterToPassedOutCaptain(Model model) {
    Pirate captain = pirateManagementService.getMyCaptain();
    captain.setPassedOut(false);
    model.addAttribute("captain", captain);
    return "pirateInfo2";
  }

  @GetMapping("/pirate/beer")
  public String askforBeer(Model model) {
    Pirate pirate = pirateManagementService.getMyCaptain();
    pirateService.drinkSumRum(pirate);
    String status = pirateService.howsItGoingMate(pirate);
    model.addAttribute("captain", pirate);
    model.addAttribute("status", status);
    return "pirateInfo2";
  }

  @RequestMapping("/pirate/fight")
  public String chooseEnemy(Model model) {
    model.addAttribute("enemies", pirateManagementService.selectPossibleEnemyList());
    return "fight";
  }

  @PostMapping("/pirate/fight1")
  public String chooseEnemy(Model model, @RequestParam String name) {
    pirateManagementService.selectForFight(name);
    Pirate captain = pirateManagementService.getMyCaptain();
    Pirate enemy = pirateManagementService.getMyEnemy();
    model.addAttribute("captain", captain);
    model.addAttribute("enemy", enemy);
    return "fight2";
  }

  @GetMapping("/pirate/fight2")
  public String startFight(Model model) {
    Pirate captain = pirateManagementService.getMyCaptain();
    Pirate enemy = pirateManagementService.getMyEnemy();
    pirateService.brawl(captain, enemy, gameService);
    PirateShip pirateShip = pirateshipHashMapRepository.findByName(captain.getName());
    if (gameService.checkIfWontheGame(captain, pirateShip )){
      model.addAttribute("win", "CONGRATULATIONS, YOU WON!!!!");
    }
    model.addAttribute("captain", captain);
    model.addAttribute("enemy", enemy);
    return "fight2";
  }

  @GetMapping("/pirate/waterInFight")
  public String giveWaterToPassedOutPirate(Model model) {
    Pirate captain = pirateManagementService.getMyCaptain();
    Pirate enemy = pirateManagementService.getMyEnemy();
    captain.setPassedOut(false);
    enemy.setPassedOut(false);
    model.addAttribute("captain", captain);
    model.addAttribute("enemy", enemy);
    return "fight2";
  }

  @GetMapping("/pirate/ship")
  public String shipInfo(Model model) {
    Pirate captain = pirateManagementService.getMyCaptain();
    pirateshipService.createIfNotExist(captain.getName());
    PirateShip pirateShip = pirateshipHashMapRepository.findByName(captain.getName());
    model.addAttribute("captain", captain);
    model.addAttribute("myShip", pirateShip);
    return "shipInfo";
  }

  @GetMapping("/pirate/shipbattle")
  public String chooseEnemyforShipBattle(Model model) {
       model.addAttribute("enemies", pirateManagementService.selectPossibleEnemyList());
      return "battle";
    }

  @PostMapping("/pirate/shipbattle1")
  public String checkEnemyShip(Model model, String name) {
    Pirate captain = pirateManagementService.getMyCaptain();
    pirateManagementService.selectForFight(name);
    Pirate enemy = pirateManagementService.getMyEnemy();
    pirateshipService.createIfNotExist(enemy.getName());
    PirateShip myShip = pirateshipHashMapRepository.findByName(captain.getName());
    PirateShip enemyShip = pirateshipHashMapRepository.findByName(enemy.getName());
    String nextBattle = "/pirate/shipbattle2";
    boolean needBackIcon = true;
    model.addAttribute("captain", captain);
    model.addAttribute("myShip", myShip);
    model.addAttribute("enemy", enemy);
    model.addAttribute("enemyShip", enemyShip);
    model.addAttribute("nextBattle", nextBattle);
    model.addAttribute("needBackIcon", needBackIcon);
    return "shipInfo2";
  }

  @GetMapping("/pirate/shipbattle2")
  public String startBattle(Model model) {
    Pirate captain = pirateManagementService.getMyCaptain();
    Pirate enemy = pirateManagementService.getMyEnemy();
    PirateShip myShip = pirateshipHashMapRepository.findByName(captain.getName());
    PirateShip enemyShip = pirateshipHashMapRepository.findByName(enemy.getName());
    pirateshipService.battle(myShip, captain, enemyShip, enemy, gameService);
    if (gameService.checkIfWontheGame(captain, myShip)){
      model.addAttribute("win", "CONGRATULATIONS, YOU WON!!!!");
    }
    String nextBattle = "/pirate/shipbattle";
    boolean needBackIcon = false;
    model.addAttribute("captain", captain);
    model.addAttribute("myShip", myShip);
    model.addAttribute("enemy", enemy);
    model.addAttribute("enemyShip", enemyShip);
    model.addAttribute("nextBattle", nextBattle);
    model.addAttribute("needBackIcon", needBackIcon);
    return "shipInfo2";
  }

  @GetMapping("/pirate/newPirateToCrew")
  public String newPirateToCrew(Model model){
    Pirate captain = pirateManagementService.getMyCaptain();
    PirateShip myShip = pirateshipHashMapRepository.findByName(captain.getName());
    pirateshipService.hirePirate(myShip);
    model.addAttribute("captain", captain);
    model.addAttribute("myShip", myShip);
    return "shipInfo";
  }

}
