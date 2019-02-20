package com.greenfoxacademy.pirateinspring.services;

import com.greenfoxacademy.pirateinspring.entities.Pirate;
import org.springframework.stereotype.Service;

@Service
public class PirateService {

    public String drinkSumRum(Pirate pirate){

    if (!pirate.isAlive() && !pirate.isPassedOut()){
      return "He is dead!";
    } else {
      pirate.setRumsDrunken((pirate.getRumsDrunken()+ (int)(Math.random() * 2) + 1));
      return "";
    }
  }

  public String howsItGoingMate(Pirate pirate) {

    if (!pirate.isAlive()){
      return "He is dead!";
    } else if (pirate.isPassedOut()){
      return "He is already passed out!";
    }else if (pirate.getRumsDrunken() >=0 && pirate.getRumsDrunken() <= 6) {
      return "Pour me anudder!";
    } else {
      pirate.setPassedOut(true);
      return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
    }
  }

  public void die(Pirate pirate){
    pirate.setAlive(false);
  }

  public String brawl(Pirate pirate, Pirate enemy){
    if (!enemy.isAlive() || enemy.isPassedOut() || !pirate.isAlive() || pirate.isPassedOut()){
      return "One of the pirates are already dead or passed out, there can be no brawl.";
    } else {
      int resultOfBrawl = (int)(Math.random() * 3);
      if (resultOfBrawl == 0){
        die(enemy);
        return "Our pirate has won.";
      } else if (resultOfBrawl == 1){
        die(pirate);
        return "Our pirate has lost.";
      } else {
        enemy.setPassedOut(true);
        pirate.setPassedOut(true);
        return "Both have passed out.";
      }
    }
  }

}
