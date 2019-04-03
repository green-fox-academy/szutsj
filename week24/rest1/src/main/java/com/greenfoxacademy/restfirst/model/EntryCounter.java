package com.greenfoxacademy.restfirst.model;


import org.springframework.data.domain.Page;

import java.util.List;

public class EntryCounter {

  private List<Log> entries;
  private long entry_count;

  public EntryCounter() {
  }

  public EntryCounter(List<Log> logs, long entry_count) {
    this.entries = logs;
    this.entry_count = entry_count;
  }

  public long getEntry_count() {
    return entry_count;
  }

  public void setEntry_count(long entry_count) {
    this.entry_count = entry_count;
  }

  public List<Log> getEntries() {
    return entries;
  }

  public void setEntries(List<Log> logs) {
    this.entries = logs;
  }
}
