package com.greenfoxacademy.restfirst.model;

public class Doubling {
  private int input;
  private int result;

  public Doubling() {
  }

  public Doubling(int input) {
    this.input = input;
    this.result = 2 * input;
  }

  public int getInput() {
    return input;
  }

  public void setInput(int recieved) {
    this.input = recieved;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
