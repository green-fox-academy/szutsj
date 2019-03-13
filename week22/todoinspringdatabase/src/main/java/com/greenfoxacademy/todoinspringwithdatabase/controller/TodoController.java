package com.greenfoxacademy.todoinspringwithdatabase.controller;

import com.greenfoxacademy.todoinspringwithdatabase.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @ResponseBody
  @RequestMapping({"/", "/list"})
  public String list(){
    return "This is my first todo";
  }

}
