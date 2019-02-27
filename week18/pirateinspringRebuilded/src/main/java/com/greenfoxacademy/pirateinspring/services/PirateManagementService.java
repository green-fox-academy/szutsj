package com.greenfoxacademy.pirateinspring.services;

import com.greenfoxacademy.pirateinspring.entities.Pirate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class PirateManagementService {

  private ArrayList<Pirate> pirateList;

  public PirateManagementService() {
    pirateList = new ArrayList<>();
    pirateList.add(new Pirate(true, "Onedin", "/pirates/onedin.jpeg"));
    pirateList.add(new Pirate(true, "Popeye", "/pirates/popeye.jpg"));
    pirateList.add(new Pirate(true, "Hook", "/pirates/hook.jpg"));
    pirateList.add(new Pirate(true, "Jack Sparrow", "/pirates/jack sparrow.jpeg"));
    pirateList.add(new Pirate(true, "Quazi", "/pirates/quazi1.jpeg"));
    pirateList.add(new Pirate(true, "Mariner from Waterworld", "/pirates/waterworld - mariner.jpg"));
    pirateList.add(new Pirate(true, "Pirate", "/pirates/pirate capitain.jpg"));
    pirateList.add(new Pirate(true, "Piszkos Fred", "/pirates/piszkos.jpeg"));
    randomRumsforCaptians();
  }

  public void select(String name){
    for (Pirate pirateInList: pirateList) {
      pirateInList.setSelected(false);
      if (pirateInList.getName().equals(name)) {
        pirateInList.setSelected(true);
      }
    }
  }

  public void reset(){
    for (Pirate pirateInList: pirateList) {
      pirateInList.setSelected(false);
      pirateInList.setSelectedToFightWith(false);
      pirateInList.setPassedOut(false);
      pirateInList.setAlive(true);
      pirateInList.setRumsDrunken(0);
    }
  }

  public ArrayList<Pirate> selectPossibleEnemyList(){
    ArrayList<Pirate> possibleEnemies = new ArrayList<>();
    for (Pirate pirate : pirateList){
      if (!pirate.isSelected() && pirate.isAlive() && !pirate.isPassedOut()){
        possibleEnemies.add(pirate);
      }
    }
    return possibleEnemies;
  }

  public void selectForFight(String name){
    for (Pirate pirateInList: pirateList) {
      if (pirateInList.getName().equals(name)){
        pirateInList.setSelectedToFightWith(true);
      } else {
        pirateInList.setSelectedToFightWith(false);
      }
    }
  }

  public Pirate getMyCaptain(){
    for (Pirate pirate: pirateList) {
      if (pirate.isSelected()){
        return pirate;
      }
    }
    return pirateList.get(0);
  }

  public Pirate getMyEnemy(){
    for (Pirate pirate: pirateList) {
      if (pirate.isSelectedToFightWith()){
        return pirate;
      }
    }
    return pirateList.get(0);
  }

  @Override
  public String toString() {
    String string = "";
    string += "PirateManagementService{";
    for(Pirate pirate : pirateList){
      string += pirate.getName();
      string += ", ";
    }
    string += "}";
    return string;
  }

  public ArrayList<Pirate> getPirateList() {
    return pirateList;
  }

  public void setPirateList(ArrayList<Pirate> pirateList) {
    this.pirateList = pirateList;
  }

  private void randomRumsforCaptians(){
    for (Pirate captain: pirateList) {
      captain.setRumsDrunken((int)(Math.random() * 6));
    }
  }

}
