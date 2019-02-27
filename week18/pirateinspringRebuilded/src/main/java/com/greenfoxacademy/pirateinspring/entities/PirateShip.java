package com.greenfoxacademy.pirateinspring.entities;


import java.util.ArrayList;

public class PirateShip {
  ArrayList<Pirate> crew;
  String shipsName;
  int treasure;

  public PirateShip(){

  }

  public PirateShip(String shipsName) {
    crew = new ArrayList<>();
    this.shipsName = shipsName;
  }

  public void add(Pirate pirate){
    crew.add(pirate);
  }

  public ArrayList<Pirate> getCrew() {
    return crew;
  }

  public void setCrew(ArrayList<Pirate> crew) {
    this.crew = crew;
  }

  public String getShipsName() {
    return shipsName;
  }

  public void setShipsName(String shipsName) {
    this.shipsName = shipsName;
  }

  public int getTreasure() {
    return treasure;
  }

  public void setTreasure(int treasure) {
    this.treasure = treasure;
  }

}
