package com.greenfoxacademy.restfirst.model;

public class Factor {

  private Integer factor;

  public Factor(DoUntil doUntil) {
    this.factor = countFactor(doUntil.getUntil());
  }

  public Integer getFactor() {
    return factor;
  }

  public void setFactor(Integer factor) {
    this.factor = factor;
  }

  private Integer countFactor(Integer number){
    Integer factor = 1;
    for (Integer i = 2; i <= number; i++) {
      factor *= i;
    }
    return factor;
  }

}
