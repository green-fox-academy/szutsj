package com.greenfoxacademy.todoinspringwithdatabase.controller;

import com.greenfoxacademy.todoinspringwithdatabase.model.Todo;
import com.greenfoxacademy.todoinspringwithdatabase.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping("list")
  public String list(Model model){
    if (todoRepository.findAll() != null) {
      model.addAttribute("todos", todoRepository.findAll());
    } else {
      model.addAttribute("none", "There are no todos for today");
    }
    return "todoList";
  }

  @GetMapping("add")
  public String callAddOption(){
    return "add";
  }

  @PostMapping("add")
  public String addNewTodo(@RequestParam String title){
    todoRepository.save(new Todo(title));
    return "redirect:/todo/list";
  }

}
