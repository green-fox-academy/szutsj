package com.greenfoxacademy.pirateinspring.services;

import com.greenfoxacademy.pirateinspring.entities.Pirate;
import com.greenfoxacademy.pirateinspring.entities.PirateShip;
import com.greenfoxacademy.pirateinspring.repositories.PirateshipHashMapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PirateshipService {

  @Autowired
  PirateshipHashMapRepository pirateshipHashMapRepository;

  public void fillShip(PirateShip pirateShip){
    int numberOfPirates = (int)(Math.random() * 15) + 1;
    for (int i = 0; i < numberOfPirates; i++) {
      pirateShip.add(new Pirate(false, String.valueOf(i), ""));
      pirateShip.setTreasure((int)(Math.random() * 5));
    }
    }

  public boolean battle(PirateShip pirateShip, Pirate captain, PirateShip enemy, Pirate enemyCaptain, GameService gameService){
    boolean win;
    int rum = (int)(Math.random() * 15) + 1;

    if (countScore(pirateShip, captain) >= countScore(enemy, enemyCaptain)){
      win = true;
      party(pirateShip, rum);
      losingMates(enemy);
      pirateShip.setTreasure(pirateShip.getTreasure() + enemy.getTreasure());
      enemy.setTreasure(0);
      gameService.setWinnedBattle(gameService.getWinnedBattle() + 1);
    } else {
      win = false;
      party(enemy, rum);
      losingMates(pirateShip);
      enemy.setTreasure(enemy.getTreasure() + pirateShip.getTreasure());
      pirateShip.setTreasure(0);
    }
    return win;
  }

  private int countScore(PirateShip pirateShip, Pirate captain) {
    int numberOfAilveCrew = 0;

    for (int i = 0; i < pirateShip.getCrew().size(); i++) {
      if (pirateShip.getCrew().get(i).isAlive()){
        numberOfAilveCrew++;
      }
    }
    return numberOfAilveCrew - captain.getRumsDrunken();
  }

  private void losingMates(PirateShip pirateship){
    for (int i = 0; i < pirateship.getCrew().size(); i++) {
      int dead = (int)(Math.random() * 2);
      if (dead == 0){
        pirateship.getCrew().get(i).setAlive(false);
      }
    }
  }

  private void party(PirateShip piratship, int rum){
    int j = 0;
    for (int i = 0; i < rum; i++) {
      piratship.getCrew().get(j).setRumsDrunken(1);
      j++;
      if (j == piratship.getCrew().size()){
        j = 0;
      }
    }
  }

  public void hirePirate(PirateShip pirateShip){
    if (pirateShip.getTreasure() == 0) return;

    pirateShip.add(new Pirate(false, String.valueOf(pirateShip.getCrew().size()), ""));
    pirateShip.setTreasure(pirateShip.getTreasure() - 1);
  }

  public boolean checkIfExists(String name){
    if (pirateshipHashMapRepository.findByName(name) == null){
      return false;
    }
    return true;
  }

  public void createIfNotExist(String name){
    if (!checkIfExists(name)){
      String shipname = name + "'s ship";
      PirateShip pirateShip = new PirateShip(shipname);
      fillShip(pirateShip);
      pirateshipHashMapRepository.save(name, pirateShip);
    }

  }

  public void reset(){
    pirateshipHashMapRepository.getShipsOfPirateCaptains().clear();
  }


}
