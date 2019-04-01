package com.greenfoxacademy.restfirst.model;

public class Sum {

  private Integer sum;

  public Sum(DoUntil doUntil) {
    this.sum = countSum(doUntil.getUntil());
  }

  public Integer getSum() {
    return sum;
  }

  public void setSum(Integer sum) {
    this.sum = sum;
  }

  private Integer countSum(Integer number){
    Integer sum = 0;
    for (Integer i = 1; i <= number; i++) {
      sum += i;
    }
    return sum;
  }

}
