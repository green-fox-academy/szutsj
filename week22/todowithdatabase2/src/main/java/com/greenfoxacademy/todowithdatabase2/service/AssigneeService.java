package com.greenfoxacademy.todowithdatabase2.service;

import com.greenfoxacademy.todowithdatabase2.model.Assignee;
import com.greenfoxacademy.todowithdatabase2.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AssigneeService {

  @Autowired
  AssigneeRepository assigneeRepository;

  public void save(Assignee assignee){
    assigneeRepository.save(assignee);
  }

  public void deleteById(Long id){
    assigneeRepository.deleteById(id);
  }

  public ArrayList<Assignee> findAll(){
    ArrayList<Assignee> assignees = assigneeRepository.findAll();
    return assignees;
  }

  public ArrayList<Assignee> findByName(String name){
    ArrayList<Assignee> assignees = assigneeRepository.findByName(name);
    return assignees;
  }

  public ArrayList<Assignee> findByEmail(String email){
    ArrayList<Assignee> assignees = assigneeRepository.findByEmail(email);
    return assignees;
  }

  public Assignee findAssigneeById(Long id){
    Assignee assignee = assigneeRepository.findAssigneeById(id);
    return assignee;
  }

  public ArrayList<Assignee> findByNameContaining(String title){
    ArrayList<Assignee> assignees = assigneeRepository.findByNameContaining(title);
    return assignees;
  }

}
