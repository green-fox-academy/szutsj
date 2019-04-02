package com.greenfoxacademy.restfirst.service;

import com.greenfoxacademy.restfirst.model.Log;
import com.greenfoxacademy.restfirst.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {

  @Autowired
  LogRepository logRepository;

  public void save(Log log){
    logRepository.save(log);
  }
}
