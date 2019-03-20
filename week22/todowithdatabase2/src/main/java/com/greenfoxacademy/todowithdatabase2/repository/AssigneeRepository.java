package com.greenfoxacademy.todowithdatabase2.repository;

import com.greenfoxacademy.todowithdatabase2.model.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {

  ArrayList<Assignee> findAll();
  ArrayList<Assignee> findByName(String name);
  ArrayList<Assignee> findByEmail(String email);
  Assignee findAssigneeById(Long id);
  ArrayList<Assignee> findByNameContaining(String title);
}
