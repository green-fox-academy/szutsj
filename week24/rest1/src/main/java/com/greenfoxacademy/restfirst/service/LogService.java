package com.greenfoxacademy.restfirst.service;

import com.greenfoxacademy.restfirst.model.Log;
import com.greenfoxacademy.restfirst.model.PageResult;
import org.springframework.data.domain.Pageable;
import com.greenfoxacademy.restfirst.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;


@Service
public class LogService{

  @Autowired
  LogRepository logRepository;

  public void save(Log log){
    logRepository.save(log);
  }

  public Page<Log> findAll(Integer page, Integer count){
    Pageable pageable = new PageResult(page, count);
    Page<Log> logs = logRepository.findAll(pageable);
    return logs;
  }

  public Page<Log> findAllByDataContaining(String word, Integer page, Integer count){
    Pageable pageable = new PageResult(page, count);
    Page<Log> logs = logRepository.findAllByDataContaining(word, pageable);
    return logs;
  }


}
