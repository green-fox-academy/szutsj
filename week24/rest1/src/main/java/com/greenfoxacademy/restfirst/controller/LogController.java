package com.greenfoxacademy.restfirst.controller;

import com.greenfoxacademy.restfirst.model.EntryCounter;
import com.greenfoxacademy.restfirst.model.Error;
import com.greenfoxacademy.restfirst.model.Log;
import com.greenfoxacademy.restfirst.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LogController {

  @Autowired
  LogService logService;


  @GetMapping("/log")
  public ResponseEntity<Object> logEntries(@RequestParam (required = false) String q){
    List<Log> logs;

    if (q == null) {
      logService.save(new Log("/log", ""));
      logs = logService.findAll();
    } else {
      logService.save(new Log("/log", "Request param: q - " + q));
      logs = logService.findAllByDateContaining(q);
    }
    return ResponseEntity.status(HttpStatus.OK).body(new EntryCounter(logs, logs.size()));
  }


}
