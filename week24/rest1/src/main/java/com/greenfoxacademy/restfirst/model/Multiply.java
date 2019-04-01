package com.greenfoxacademy.restfirst.model;

public class Multiply {

  private int result;

  public Multiply(int[] numbers) {
    this.result = multiply(numbers);
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  private int multiply(int[] numbers){
    if (numbers.length==0) return 0;

    int result = numbers[0];

    for (int i = 1; i < numbers.length; i++) {
      result *= numbers[i];
    }

    return result;
  }

}
