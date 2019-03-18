package com.greenfoxacademy.todowithdatabase2.controller;


import com.greenfoxacademy.todowithdatabase2.model.Todo;
import com.greenfoxacademy.todowithdatabase2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping({"list", "/"})
  public String list(Model model, @RequestParam (required = false) Boolean isActive){
    List<Todo> actualList = new ArrayList<>();

    if (isActive != null){
      actualList = todoRepository.findByDone(!isActive);
    } else if (todoRepository.findAll() != null) {
      actualList = todoRepository.findAll();
    }

    if (actualList.size() == 0){
      model.addAttribute("none", "No todos to list");
    } else {
      model.addAttribute("todos", actualList);
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

  @GetMapping("{id}/delete")
  public String delete(@PathVariable Long id){
    todoRepository.deleteById(id);
    return "redirect:/todo/list";
  }

  @GetMapping("{id}/edit")
  public String chooseToEdit(Model model, @PathVariable Long id){
    model.addAttribute("todo", todoRepository.findTodoById(id));
    return "edit";
  }

  @PostMapping("{id}/edit")
  public String Edit(@ModelAttribute Todo todo){
    todoRepository.save(todo);
    return "redirect:/todo/list";
  }

}
