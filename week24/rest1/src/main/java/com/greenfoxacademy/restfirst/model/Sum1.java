package com.greenfoxacademy.restfirst.model;

public class Sum1 {

  private int result;

  public Sum1(int[] result) {
    this.result = sum(result);
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  private int sum(int[] numbers){
    int result = 0;

    for (int number: numbers) {
      result += number;
    }
    return result;
  }

}
