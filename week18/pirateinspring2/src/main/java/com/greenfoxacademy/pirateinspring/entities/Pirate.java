package com.greenfoxacademy.pirateinspring.entities;


public class Pirate {
  private String name;
  private boolean captain;
  private int rumsDrunken;
  private boolean passedOut;
  private boolean alive;
  private String pictureSource;
  private boolean selected;

  public Pirate(){
    
  }

  public Pirate(boolean captain, String name, String pictureSource){
    this.captain = captain;
    this.name = name;
    rumsDrunken = 0;
    passedOut = false;
    alive = true;
    this.pictureSource = pictureSource;
    selected = false;
  }

  public boolean isCaptain() {
    return captain;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCaptain(boolean captain) {
    this.captain = captain;
  }

  public int getRumsDrunken() {
    return rumsDrunken;
  }

  public void setRumsDrunken(int rumsDrunken) {
    this.rumsDrunken = rumsDrunken;
  }

  public boolean isPassedOut() {
    return passedOut;
  }

  public void setPassedOut(boolean passedOut) {
    this.passedOut = passedOut;
  }

  public boolean isAlive() {
    return alive;
  }

  public void setAlive(boolean alive) {
    this.alive = alive;
  }

  public String getPictureSource() {
    return pictureSource;
  }

  public void setPictureSource(String pictureSource) {
    this.pictureSource = pictureSource;
  }

  public boolean isSelected() {
    return selected;
  }

  public void setSelected(boolean selected) {
    this.selected = selected;
  }
}
