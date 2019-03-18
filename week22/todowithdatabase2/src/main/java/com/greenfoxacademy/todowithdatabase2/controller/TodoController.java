package com.greenfoxacademy.todowithdatabase2.controller;


import com.greenfoxacademy.todowithdatabase2.model.Todo;
import com.greenfoxacademy.todowithdatabase2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping({"list", "/"})
  public String list(Model model, @RequestParam (required = false) Boolean isActive){
    if (isActive != null){
      model.addAttribute("todos", todoRepository.findByDone(!isActive));
    } else if (todoRepository.findAll() != null) {
      model.addAttribute("todos", todoRepository.findAll());
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
