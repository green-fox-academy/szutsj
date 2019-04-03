package com.greenfoxacademy.restfirst.model;

public class TextToTranslate {

  private String text;
  private String lang;

  public TextToTranslate() {
  }

  public TextToTranslate(String text) {
    this.text = text;
    this.lang = hu;
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
