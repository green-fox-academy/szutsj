package com.greenfoxacademy.pirateinspring.repositories;


import com.greenfoxacademy.pirateinspring.entities.Pirate;
import com.greenfoxacademy.pirateinspring.entities.PirateShip;

interface PirateshipRepository {

  public void save(String name, PirateShip pirateShip);

  public PirateShip findByName(String name);


}
