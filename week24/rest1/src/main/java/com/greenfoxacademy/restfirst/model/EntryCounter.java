package com.greenfoxacademy.restfirst.model;


import java.util.List;

public class EntryCounter {

  private List<Log> entries;
  private int entry_count;

  public EntryCounter() {
  }

  public EntryCounter(List<Log> logs, int entry_count) {
    this.entries = logs;
    this.entry_count = entry_count;
  }

  public int getEntry_count() {
    return entry_count;
  }

  public void setEntry_count(int entry_count) {
    this.entry_count = entry_count;
  }

  public List<Log> getEntries() {
    return entries;
  }

  public void setEntries(List<Log> logs) {
    this.entries = logs;
  }
}
