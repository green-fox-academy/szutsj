package com.greenfoxacademy.restfirst.model;

public class Sum1 {

  private int sum;

  public Sum1(int[] numbers) {
    this.sum = countSum(numbers);
  }

  public int getSum() {
    return sum;
  }

  public void setSum(int  sum) {
    this.sum = sum;
  }

  private int countSum(int[] number){
    int sum = 0;
    for (int i = 1; i <= number.length; i++) {
      sum += i;
    }
    return sum;
  }

}
