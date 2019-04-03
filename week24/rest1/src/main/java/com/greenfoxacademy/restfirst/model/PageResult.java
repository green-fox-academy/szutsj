package com.greenfoxacademy.restfirst.model;

import org.springframework.data.domain.PageRequest;

public class PageResult extends PageRequest {

  public PageResult(int page, int size) {
    super(page, size);
  }
}
