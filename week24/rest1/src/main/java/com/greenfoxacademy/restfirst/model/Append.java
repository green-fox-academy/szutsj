package com.greenfoxacademy.restfirst.model;

public class Append {

  private String appended;

  public Append(String appendable) {
    this.appended = appendable + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }

}

