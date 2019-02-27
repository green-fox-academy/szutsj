package com.greenfoxacademy.pirateinspring.services;

import com.greenfoxacademy.pirateinspring.entities.Pirate;
import com.greenfoxacademy.pirateinspring.entities.PirateShip;
import org.springframework.stereotype.Service;

@Service
public class GameService {

  int winnedBattle;
  int winnedBrawl;

  public GameService(){
    winnedBattle = 0;
    winnedBrawl = 0;
  }

  public void reset(){
    winnedBrawl = 0;
    winnedBattle = 0;
  }

  public boolean checkIfWontheGame(Pirate pirate, PirateShip pirateShip){
    if (pirate == null) return false;
    if (pirateShip == null) return false;
    
    boolean win = true;
    if (pirate.isPassedOut()){
      win = false;
    }
    if (!pirate.isAlive()){
      win = false;
    }
    if (pirateShip.getTreasure() < 2){
      win = false;
    }
    if (winnedBattle < 2){
      win = false;
    }
    if (winnedBrawl < 2){
      win = false;
    }
    return win;
  }

  public int getWinnedBattle() {
    return winnedBattle;
  }

  public void setWinnedBattle(int winnedBattle) {
    this.winnedBattle = winnedBattle;
  }

  public int getWinnedBrawl() {
    return winnedBrawl;
  }

  public void setWinnedBrawl(int winnedBrawl) {
    this.winnedBrawl = winnedBrawl;
  }
}
