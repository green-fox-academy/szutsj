package com.greenfoxacademy.restfirst.service;

import com.greenfoxacademy.restfirst.model.Log;
import com.greenfoxacademy.restfirst.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LogService {

  @Autowired
  LogRepository logRepository;

  public void save(Log log){
    logRepository.save(log);
  }

  public ArrayList<Log> findAll(){
    return  logRepository.findAll();
  }

  public ArrayList<Log> findAllByDateContaining(String word){
    return  logRepository.findAllByDataContaining(word);
  }


}
