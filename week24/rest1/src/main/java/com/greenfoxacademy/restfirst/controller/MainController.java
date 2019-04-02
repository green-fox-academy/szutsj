package com.greenfoxacademy.restfirst.controller;

import com.greenfoxacademy.restfirst.model.Log;
import com.greenfoxacademy.restfirst.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @Autowired
  LogService logService;

  @GetMapping("/")
  public String renderIndexHtml(){
    logService.save(new Log("/", ""));
    return "index.html";
  }
}
