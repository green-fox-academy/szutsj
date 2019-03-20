package com.greenfoxacademy.todowithdatabase2.controller;

import com.greenfoxacademy.todowithdatabase2.model.Assignee;
import com.greenfoxacademy.todowithdatabase2.service.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("assignee")
public class AssigneeController {

  @Autowired
  AssigneeService assigneeService;

  @GetMapping({"/", "list", ""})
  public String list(Model model){
    List<Assignee> actualList = new ArrayList<>();

    if (assigneeService.findAll() != null) {
      actualList = assigneeService.findAll();
    }

    if (actualList.size() == 0){
      model.addAttribute("none", "No assignees to list");
    } else {
      model.addAttribute("assignees", actualList);
    }

    return "assignees";
  }

  @GetMapping("add")
  public String callAddOption(){
    return "addAssignee";
  }

  @PostMapping("add")
  public String addNewTodo(@RequestParam String name, String email){
    assigneeService.save(new Assignee(name, email));
    return "redirect:/assignee";
  }

  @GetMapping("{id}/delete")
  public String delete(@PathVariable Long id){
    assigneeService.deleteById(id);
    return "redirect:/assignee/list";
  }

  @GetMapping("{id}/edit")
  public String chooseToEdit(Model model, @PathVariable Long id){
    model.addAttribute("assignee", assigneeService.findAssigneeById(id));
    return "editAssignee";
  }

  @PostMapping("{id}/edit")
  public String Edit(@ModelAttribute Assignee assignee){
    assigneeService.save(assignee);
    return "redirect:/assignee/list";
  }

  @GetMapping("search")
  public String toSearchPage(){
    return "searchAssignee";
  }

  @PostMapping("search")
  public String search(Model model, @RequestParam String name){
    model.addAttribute("assignees", assigneeService.findByNameContaining(name));
    return "assignees";
  }

}
