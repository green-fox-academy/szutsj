package com.greenfoxacademy.todoinspringwithdatabase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @ResponseBody
  @RequestMapping({"/", "/list"})
  public String list(){
    return "This is my first todo";
  }

}
