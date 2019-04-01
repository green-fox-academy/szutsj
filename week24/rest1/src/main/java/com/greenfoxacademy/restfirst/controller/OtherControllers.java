package com.greenfoxacademy.restfirst.controller;

import com.greenfoxacademy.restfirst.model.Doubling;
import com.greenfoxacademy.restfirst.model.Error;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherControllers {


  @GetMapping("/doubling")
  public Object countDouble(@RequestParam (required = false) Integer input){
    if (input == null){
      return new Error("Please provide an input!");
    }
    return new Doubling(input);
  }

}