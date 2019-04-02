package com.greenfoxacademy.restfirst.model;

public class Factor {

  private int factor;

  public Factor(Until until) {
    this.factor = countFactor(until.getUntil());
  }

  public int getFactor() {
    return factor;
  }

  public void setFactor(Integer factor) {
    this.factor = factor;
  }

  private int countFactor(Integer number){
    int factor = 1;
    for (int i = 2; i <= number; i++) {
      factor *= i;
    }
    return factor;
  }

}
