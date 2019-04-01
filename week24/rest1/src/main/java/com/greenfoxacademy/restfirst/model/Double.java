package com.greenfoxacademy.restfirst.model;

public class Double {

  private int[] result;

  public Double(int[] numbers) {
    this.result = doubleNumbers(numbers);
  }

  public int[] getResult() {
    return result;
  }

  public void setResult(int[] result) {
    this.result = result;
  }

  private int[] doubleNumbers(int[] numbers){
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = numbers[i] * 2;
    }
    return numbers;
  }

}
