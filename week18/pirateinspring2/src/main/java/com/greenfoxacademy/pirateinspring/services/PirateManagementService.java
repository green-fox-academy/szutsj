package com.greenfoxacademy.pirateinspring.services;

import com.greenfoxacademy.pirateinspring.entities.Pirate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class PirateManagementService {

  private ArrayList<Pirate> pirateList;

  public PirateManagementService(){
    pirateList = new ArrayList<>();
    pirateList.add(new Pirate(true, "Captain Onedin", "src/main/resources/static/pirates/onedin.jpeg"));
    pirateList.add(new Pirate(true, "Popeye", "src/main/resources/static/pirates/popeye.jpg"));
    pirateList.add(new Pirate(true, "Captain Hook", "/home/judit/tanulas/greenfox/szutsj/week18/pirateinspring2/src/main/resources/static/pirates/hook.jpg"));
    pirateList.add(new Pirate(true, "Captain Jack Sparrow", "src/main/resources/static/pirates/jack sparrow.jpeg"));
    pirateList.add(new Pirate(true, "Quazi", "src/main/resources/static/pirates/quazi.jpeg"));
    pirateList.add(new Pirate(true, "Mariner form Waterworld", "src/main/resources/static/pirates/waterworld - mariner.jpg"));

  }

  public void select(Pirate pirate){
    for (Pirate pirateInList: pirateList) {
      if (pirateInList.getName().equals(pirate.getName())){
        pirateInList.setSelected(true);
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

}
