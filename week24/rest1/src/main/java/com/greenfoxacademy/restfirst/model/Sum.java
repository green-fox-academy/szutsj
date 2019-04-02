package com.greenfoxacademy.restfirst.model;

public class Sum {

  private int sum;

  public Sum(Until until) {
    this.sum = countSum(until.getUntil());
  }

  public int getSum() {
    return sum;
  }

  public void setSum(int  sum) {
    this.sum = sum;
  }

  private int countSum(int number){
    int sum = 0;
    for (int i = 1; i <= number; i++) {
      sum += i;
    }
    return sum;
  }

}
