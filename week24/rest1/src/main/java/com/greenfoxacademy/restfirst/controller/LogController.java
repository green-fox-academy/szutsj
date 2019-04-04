package com.greenfoxacademy.restfirst.controller;

import com.greenfoxacademy.restfirst.model.EntryCounter;
import com.greenfoxacademy.restfirst.model.Error;
import com.greenfoxacademy.restfirst.model.Log;
import com.greenfoxacademy.restfirst.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
  public ResponseEntity<Object> logEntries(@RequestParam(required = false) String q, Integer count, Integer page) {
    Page<Log> logs;
    logService.save(new Log("/log", "Request param: q - " + q + ", count - " + count + ", page -" + page));

    if (count == null){
      count = 20;
    }

    if (page == null){
      page = 1;
    }

    if (q != null){
      logs = logService.findAllByDataContaining(q, page, count);
    } else {
      logs = logService.findAll(page, count);
    }

    List<Log> logsAL = logs.getContent();

    if (logsAL.size() == 0){
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Error("Nincs mit listázni"));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new EntryCounter(logsAL, logsAL.size()));
    }
  }

}
