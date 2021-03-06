package com.greenfoxacademy.restfirst.model;

public class TextToTranslate {

  private String text;

  public TextToTranslate() {
  }

  public TextToTranslate(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return "{ \"text\" : \"" + text + "\"}";
  }

}
