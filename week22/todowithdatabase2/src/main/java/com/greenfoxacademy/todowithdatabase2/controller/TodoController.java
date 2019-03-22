package com.greenfoxacademy.todowithdatabase2.controller;



import com.greenfoxacademy.todowithdatabase2.model.Todo;
import com.greenfoxacademy.todowithdatabase2.service.AssigneeService;
import com.greenfoxacademy.todowithdatabase2.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("todo")
public class TodoController {

  @Autowired
  TodoService todoService;

  @Autowired
  AssigneeService assigneeService;

  @GetMapping({"list", "/", ""})
  public String list(Model model, @RequestParam (required = false) Boolean isActive){
    List<Todo> actualList = new ArrayList<>();

    if (isActive != null){
      actualList = todoService.findByDone(!isActive);
    } else if (todoService.findAll() != null) {
      actualList = todoService.findAll();
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
    todoService.save(new Todo(title));
    return "redirect:/todo/list";
  }

  @GetMapping("{id}/delete")
  public String delete(@PathVariable Long id){
    todoService.deleteById(id);
    return "redirect:/todo/list";
  }

  @GetMapping("{id}/edit")
  public String chooseToEdit(Model model, @PathVariable Long id){
    model.addAttribute("todo", todoService.findTodoById(id));
    model.addAttribute("assignees", assigneeService.findAll());
    return "edit";
  }

  @PostMapping("{id}/edit")
  public String Edit(@ModelAttribute Todo todo, @RequestParam String duedate){
    todo.setDueDate(LocalDate.parse(duedate));
    todoService.save(todo);
    return "redirect:/todo/list";
  }

  @GetMapping("search")
  public String toSearchPage(){
    return "search";
  }

  @PostMapping("search")
  public String search(Model model, @RequestParam String title){
    model.addAttribute("todos", todoService.findTitleByContaining(title));
    return "todoList";
  }


}
