package com.greenfoxacademy.pirateinspring.repositories;

import com.greenfoxacademy.pirateinspring.entities.PirateShip;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class PirateshipHashMapRepository implements PirateshipRepository{

  HashMap<String, PirateShip> shipsOfPirateCaptains;

  public PirateshipHashMapRepository(){
    shipsOfPirateCaptains = new HashMap<>();
  }

  @Override
  public PirateShip findByName(String name){
    return shipsOfPirateCaptains.get(name);
  }

  @Override
  public void save(String name, PirateShip pirateShip){
    shipsOfPirateCaptains.put(name, pirateShip);
  }

  public HashMap<String, PirateShip> getShipsOfPirateCaptains() {
    return shipsOfPirateCaptains;
  }

  public void setShipsOfPirateCaptains(HashMap<String, PirateShip> shipsOfPirateCaptains) {
    this.shipsOfPirateCaptains = shipsOfPirateCaptains;
  }

}
