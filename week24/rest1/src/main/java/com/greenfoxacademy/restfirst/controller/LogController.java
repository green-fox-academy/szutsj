package com.greenfoxacademy.restfirst.controller;

import com.greenfoxacademy.restfirst.model.Error;
import com.greenfoxacademy.restfirst.model.Log;
import com.greenfoxacademy.restfirst.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LogController {

  @Autowired
  LogService logService;


  @GetMapping("/log")
  public ResponseEntity<Object> logEntries(){
    logService.save(new Log("/log", ""));
    List<Log> logs = logService.findAll();
    return ResponseEntity.status(HttpStatus.OK).body(logs);
  }
}
